package com.pokemon.model;

import java.util.logging.Logger;

public class Specie {
	
	private static final Logger LOGGER = Logger.getLogger(Specie.class.getName());

	private Integer id;
	private String name;
	private String url;
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
