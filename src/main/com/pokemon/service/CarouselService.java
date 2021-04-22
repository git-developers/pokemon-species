package com.pokemon.service;

import com.pokemon.model.Specie;
import com.pokemon.model.Species;

public interface CarouselService {

	public void register(Specie specie);
	
	public Species fetch(String url);
	
	
}
