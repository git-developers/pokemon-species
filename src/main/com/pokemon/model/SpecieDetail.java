package com.pokemon.model;

import java.util.List;
import java.util.logging.Logger;

public class SpecieDetail {
	
	private static final Logger LOGGER = Logger.getLogger(SpecieDetail.class.getName());

	private Integer id;
	private String base_happiness;
	private String capture_rate;
	private Placeholder color;
	private List<Placeholder> egg_groups;
	private Placeholder evolution_chain;
	private Placeholder evolves_from_species;
	private List<FlavorTextEntry> flavor_text_entries;
	private List<Placeholder> form_descriptions;
	private Boolean forms_switchable;
	private String gender_rate;
	private List<Genera> genera;
	private Placeholder generation;
	private Placeholder growth_rate;
	private Placeholder habitat;
	private Boolean has_gender_differences;
	private int hatch_counter;
	private Boolean is_baby;
	private Boolean is_legendary;
	private Boolean is_mythical;
	private String name;
	private List<Name> names;
	private int order;
	private List<PokedexNumbers> pokedex_numbers;
	private Placeholder shape;
	private List<Variety> varieties;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBase_happiness() {
		return base_happiness;
	}
	public void setBase_happiness(String base_happiness) {
		this.base_happiness = base_happiness;
	}
	public String getCapture_rate() {
		return capture_rate;
	}
	public void setCapture_rate(String capture_rate) {
		this.capture_rate = capture_rate;
	}
	public Placeholder getColor() {
		return color;
	}
	public void setColor(Placeholder color) {
		this.color = color;
	}
	public List<Placeholder> getEgg_groups() {
		return egg_groups;
	}
	public void setEgg_groups(List<Placeholder> egg_groups) {
		this.egg_groups = egg_groups;
	}
	public Placeholder getEvolution_chain() {
		return evolution_chain;
	}
	public void setEvolution_chain(Placeholder evolution_chain) {
		this.evolution_chain = evolution_chain;
	}
	public List<FlavorTextEntry> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<FlavorTextEntry> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<Placeholder> getForm_descriptions() {
		return form_descriptions;
	}
	public void setForm_descriptions(List<Placeholder> form_descriptions) {
		this.form_descriptions = form_descriptions;
	}
	public Boolean getForms_switchable() {
		return forms_switchable;
	}
	public void setForms_switchable(Boolean forms_switchable) {
		this.forms_switchable = forms_switchable;
	}
	public String getGender_rate() {
		return gender_rate;
	}
	public void setGender_rate(String gender_rate) {
		this.gender_rate = gender_rate;
	}
	public List<Genera> getGenera() {
		return genera;
	}
	public void setGenera(List<Genera> genera) {
		this.genera = genera;
	}
	public Placeholder getGeneration() {
		return generation;
	}
	public void setGeneration(Placeholder generation) {
		this.generation = generation;
	}
	public Placeholder getGrowth_rate() {
		return growth_rate;
	}
	public void setGrowth_rate(Placeholder growth_rate) {
		this.growth_rate = growth_rate;
	}
	public Placeholder getHabitat() {
		return habitat;
	}
	public void setHabitat(Placeholder habitat) {
		this.habitat = habitat;
	}
	public Boolean getHas_gender_differences() {
		return has_gender_differences;
	}
	public void setHas_gender_differences(Boolean has_gender_differences) {
		this.has_gender_differences = has_gender_differences;
	}
	public int getHatch_counter() {
		return hatch_counter;
	}
	public void setHatch_counter(int hatch_counter) {
		this.hatch_counter = hatch_counter;
	}
	public Boolean getIs_baby() {
		return is_baby;
	}
	public void setIs_baby(Boolean is_baby) {
		this.is_baby = is_baby;
	}
	public Boolean getIs_legendary() {
		return is_legendary;
	}
	public void setIs_legendary(Boolean is_legendary) {
		this.is_legendary = is_legendary;
	}
	public Boolean getIs_mythical() {
		return is_mythical;
	}
	public void setIs_mythical(Boolean is_mythical) {
		this.is_mythical = is_mythical;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public Placeholder getShape() {
		return shape;
	}
	public void setShape(Placeholder shape) {
		this.shape = shape;
	}
	public List<Variety> getVarieties() {
		return varieties;
	}
	public void setVarieties(List<Variety> varieties) {
		this.varieties = varieties;
	}
	public static Logger getLogger() {
		return LOGGER;
	}
	public List<PokedexNumbers> getPokedex_numbers() {
		return pokedex_numbers;
	}
	public void setPokedex_numbers(List<PokedexNumbers> pokedex_numbers) {
		this.pokedex_numbers = pokedex_numbers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public Placeholder getEvolves_from_species() {
		return evolves_from_species;
	}
	public void setEvolves_from_species(Placeholder evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
	}
	
	
	
}
