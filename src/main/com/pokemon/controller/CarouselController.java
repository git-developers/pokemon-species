package com.pokemon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pokemon.model.Specie;
import com.pokemon.model.Species;
import com.pokemon.service.CarouselService;

@Controller
public class CarouselController {
	
	@Autowired
	public CarouselService carouselService;

	@RequestMapping(value = "/pokemon-species", method = RequestMethod.GET)
	public ModelAndView showRegister(
		HttpServletRequest request, 
		HttpServletResponse response) {
		
		Species species = carouselService.fetch("https://pokeapi.co/api/v2/pokemon-species");
		
		ModelAndView mav = new ModelAndView("pokemon-species");
		mav.addObject("species", species);

		return mav;
	}

	@RequestMapping(value = "/register-specie", method = RequestMethod.POST)
	public ModelAndView addUser(
		HttpServletRequest request, 
		HttpServletResponse response,
		@ModelAttribute("specie") Specie specie) {

		carouselService.register(specie);

		return new ModelAndView("index", "name", specie.getName());
	}
}