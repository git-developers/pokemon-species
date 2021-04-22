package com.pokemon.model;

import java.util.logging.Logger;

public class Name {
	
	private static final Logger LOGGER = Logger.getLogger(Name.class.getName());

	private Integer id;
	private String name;
	private Placeholder language;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Placeholder getLanguage() {
		return language;
	}
	public void setLanguage(Placeholder language) {
		this.language = language;
	}
	
	
	
	
}
