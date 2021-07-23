package com.dobatii.java.labs.labjava.exo2;

import java.util.Scanner;

import com.dobatii.java.labs.labjava.exo2.enums.TypeAmplicaficateurEnum;
import com.dobatii.java.labs.labjava.exo2.service.AmplificateurService;

public class LabJavaExo2Main {

	public static void main(String[] args) throws Exception {
		
		String response = null;
		
		do {
			AmplificateurService ampliService = new AmplificateurService();
			ampliService.saisirValeurs();
			
			TypeAmplicaficateurEnum typeAmpli = ampliService.choisirTypeAmplificateur();
			System.out.println("Type amplificateur = " + typeAmpli.getTypeAmplicaficateur());
			System.out.println();
			
			float gain = ampliService.calculerGain(typeAmpli);
			System.out.println("Gain = " + gain);
			System.out.println();
			
			float sortieVs = ampliService.calculerSortieVs(typeAmpli, gain);
			System.out.println("Sortie Vs = " + sortieVs);
			System.out.println();
			
			Scanner lectureChoixParClavier = new Scanner(System.in);
			System.out.println("Refaire l'exécution du programme ? oui/non :");
			response = lectureChoixParClavier.next();
			
		} while (null != response && response.equalsIgnoreCase("oui"));
	}

}
