package com.pokemon.model;

import java.util.logging.Logger;

public class FlavorTextEntry {
	
	private static final Logger LOGGER = Logger.getLogger(FlavorTextEntry.class.getName());

	private Integer id;
	private String flavor_text;
	private Placeholder language;
	private Placeholder version;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlavor_text() {
		return flavor_text;
	}
	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
	}
	public Placeholder getLanguage() {
		return language;
	}
	public void setLanguage(Placeholder language) {
		this.language = language;
	}
	public Placeholder getVersion() {
		return version;
	}
	public void setVersion(Placeholder version) {
		this.version = version;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
	
	
}
