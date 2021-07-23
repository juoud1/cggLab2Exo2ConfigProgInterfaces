package com.dobatii.java.labs.labjava.exo2.service;

import java.util.Scanner;

import com.dobatii.java.labs.labjava.exo2.enums.TypeAmplicaficateurEnum;

public class AmplificateurService {
	
	private Scanner lectureClavier;
	
	// Variables pour recevoir les données entrées au clavier 
	private int r1Saisie;
	private int r2Saisie;
	private float veSaisie;
	
	
	public AmplificateurService() {
		super();
		this.lectureClavier = new Scanner(System.in);
		
	}

	public void saisirValeurs() {
		
		System.out.println("Saisir R1 :");
		r1Saisie = lectureClavier.nextInt();
		
		System.out.println("Saisir R2 :");
		r2Saisie = lectureClavier.nextInt();
        
		System.out.println("Saisir Ve :");
		veSaisie = lectureClavier.nextFloat();
		
	}
	
	private int saisirCodeTypeAmplificateur() {
	
		int codeSaisi= 0;
		
		System.out.println("Choisir le type d'amplificateur en saisissant \n1 (ampli inverseur) ou bien \n2 ((ampli non inverseur)) :");
		codeSaisi = lectureClavier.nextInt();
    
        return codeSaisi;
	}

	public TypeAmplicaficateurEnum choisirTypeAmplificateur() throws Exception {
		
		int codeAmpli = saisirCodeTypeAmplificateur();
		
		switch (codeAmpli) {
		case 1:
			return TypeAmplicaficateurEnum.AMPLIOPINVERSEUR;
			
		case 2:
			return TypeAmplicaficateurEnum.AMPLIOPNONINVERSEUR;
			
		default:
			throw new Exception("Code choisi ne correspond à aucun amplificateur!");
		}
	}
	
	public float calculerGain (final TypeAmplicaficateurEnum typeAmpli) {
		
		float gain = 0;
		
		try {
			
			switch (typeAmpli.getTypeAmplicaficateurId()) {
			case 1:
				gain = r2Saisie/r1Saisie;
				break;

			case 2:
				gain = 1.0f + (r2Saisie/r1Saisie);
				break;
			
			default:
				gain = 0;
				break;
			}
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		
		return gain;
		
	}
	
	public float calculerSortieVs (final TypeAmplicaficateurEnum typeAmpli, final float gain) {
		
		float valeurVs = 0;
		
		try {
			
			switch (typeAmpli.getTypeAmplicaficateurId()) {
			case 1:
				valeurVs = -1 * gain * veSaisie;
				break;

			case 2:
				valeurVs = gain * veSaisie;
				break;
			
			default:
				valeurVs = 0;
				break;
			}
			
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		
		return valeurVs;
		
	}
}
