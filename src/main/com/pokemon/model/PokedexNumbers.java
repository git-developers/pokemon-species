package com.pokemon.model;

import java.util.logging.Logger;

public class PokedexNumbers {
	
	private static final Logger LOGGER = Logger.getLogger(PokedexNumbers.class.getName());

	private Integer id;
	private Integer entry_number;
	private Placeholder pokedex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEntry_number() {
		return entry_number;
	}
	public void setEntry_number(Integer entry_number) {
		this.entry_number = entry_number;
	}
	public Placeholder getPokedex() {
		return pokedex;
	}
	public void setPokedex(Placeholder pokedex) {
		this.pokedex = pokedex;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
	
	
	
}
