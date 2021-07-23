package com.dobatii.java.labs.labjava.exo2.enums;

public enum TypeAmplicaficateurEnum {
	
	AMPLIOPINVERSEUR (1, "Ampli OP inverseur"),
	AMPLIOPNONINVERSEUR (2, "Ampli OP non inverseur");
	
	private int typeAmplicaficateurId;
	private String typeAmplicaficateur;
	
	private TypeAmplicaficateurEnum(int typeAmplicaficateurId, String typeAmplicaficateur) {
		this.typeAmplicaficateurId = typeAmplicaficateurId;
		this.typeAmplicaficateur = typeAmplicaficateur;
	}

	public int getTypeAmplicaficateurId() {
		return typeAmplicaficateurId;
	}

	public String getTypeAmplicaficateur() {
		return typeAmplicaficateur;
	}
	
}
