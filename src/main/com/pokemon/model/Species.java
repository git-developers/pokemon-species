package com.pokemon.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Species {
	
	private static final Logger LOGGER = Logger.getLogger(Species.class.getName());

	private List<Specie> specieLst;

	public List<Specie> getSpecieLst() {
		return specieLst;
	}

	public void setSpecieLst(List<Specie> specieLst) {
		this.specieLst = specieLst;
	}
	
	public List<Specie> addToList() {
		if (specieLst == null) {
			specieLst = new ArrayList<Specie>();
		}
		return specieLst;
	}
	
}
