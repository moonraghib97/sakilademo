package com.example.tsi.moon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.PrimitiveIterator;

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
	private String save = "save";

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
	@PostMapping("/AddLanguages")
	public @ResponseBody
	String addLanguage(@RequestParam String name) {
		Language addLanguage = new Language(name);
		languageRepository.save(addLanguage);
		return save;
	}
	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable <Language> getAllLanguages(){
		return languageRepository.findAll();
	}



	@PostMapping("/AddActors")
	public @ResponseBody
	void addActors(@RequestParam String first_name, @RequestParam String last_name) {
		Actor addActor = new Actor(first_name, last_name);
		actorRepository.save(addActor);
	}
	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable <Actor> getAllActors(){
		return actorRepository.findAll();
	}



	@PostMapping("/AddCategories")
	Category createCategoies(@Validated @RequestBody Category newCategory){return categoryRepository.save(newCategory);}
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
