package com.pokemon.model;

import java.util.logging.Logger;

public class Genera {
	
	private static final Logger LOGGER = Logger.getLogger(Genera.class.getName());

	private Integer id;
	private String genus;
	private Placeholder language;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public Placeholder getLanguage() {
		return language;
	}
	public void setLanguage(Placeholder language) {
		this.language = language;
	}
	
	
	
}
