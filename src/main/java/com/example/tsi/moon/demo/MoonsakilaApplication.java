package com.example.tsi.moon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/Home")

public class MoonsakilaApplication {

	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private InventoryRepository inventoryRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired CityRepository cityRepository;

	public MoonsakilaApplication(LanguageRepository languageRepository, ActorRepository actorRepository, CategoryRepository categoryRepository,
								 InventoryRepository inventoryRepository, FilmRepository filmRepository, CityRepository cityRepository){
		this.languageRepository = languageRepository;
		this.actorRepository = actorRepository;
		this.categoryRepository = categoryRepository;
		this.inventoryRepository = inventoryRepository;
		this.filmRepository = filmRepository;
		this.cityRepository = cityRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MoonsakilaApplication.class, args);

	}
	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable <Language> getAllLanguages(){
		return languageRepository.findAll();
	}
	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable <Actor> getAllActors(){
		return actorRepository.findAll();
	}
	@GetMapping("/AllCategories")
	public @ResponseBody
	Iterable <Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	@GetMapping("/AllInventory")
	public @ResponseBody
	Iterable <Inventory> getAllInventory(){
		return inventoryRepository.findAll();
	}
	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable <Film> getAllFilms(){
		return filmRepository.findAll();
	}
	@GetMapping("/AllCities")
	public @ResponseBody
	Iterable <City> getAllCities(){
		return cityRepository.findAll();
	}
}
