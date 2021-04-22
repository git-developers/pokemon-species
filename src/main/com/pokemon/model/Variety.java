package com.pokemon.model;

import java.util.logging.Logger;

public class Variety {
	
	private static final Logger LOGGER = Logger.getLogger(Variety.class.getName());

	private Integer id;
	private Boolean is_default;
	private Placeholder pokemon;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIs_default() {
		return is_default;
	}
	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}
	public Placeholder getPokemon() {
		return pokemon;
	}
	public void setPokemon(Placeholder pokemon) {
		this.pokemon = pokemon;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
	
	
	
}
