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
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private ReviewRepository reviewRepository;

	private String save = "save";

	public MoonsakilaApplication(LanguageRepository languageRepository, ActorRepository actorRepository,
								 CategoryRepository categoryRepository, InventoryRepository inventoryRepository,
								 FilmRepository filmRepository,
								 CityRepository cityRepository, ReviewRepository reviewRepository){
		this.languageRepository = languageRepository;
		this.actorRepository = actorRepository;
		this.categoryRepository = categoryRepository;
		this.inventoryRepository = inventoryRepository;
		this.filmRepository = filmRepository;
		this.cityRepository = cityRepository;
		this.reviewRepository=reviewRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MoonsakilaApplication.class, args);
	}



	@PostMapping("/AddLanguage")
	public @ResponseBody String addLanguage(@RequestParam String name){
		Language addLanguage = new Language(name);
		languageRepository.save(addLanguage);
		return save;
	}
	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}




	@PostMapping("/AddActor")
	public @ResponseBody String addActor(@RequestParam String first_name, @RequestParam String last_name){
		Actor addActor = new Actor(first_name, last_name);
		actorRepository.save(addActor);
		return save;
	}
	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}




	@PostMapping("/AddCategory")
	public @ResponseBody String addCategory(@RequestParam String name){
		Category addCategory = new Category(name);
		categoryRepository.save(addCategory);
		return save;
	}
	@GetMapping("/AllCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}




	@GetMapping("/AllReviews")
	public @ResponseBody
	Iterable<Review>getAllReview(){
		return reviewRepository.findAll();
	}

	@PostMapping("/AddReviews")
	public @ResponseBody
	String addReviews(@RequestParam int film_film_id, String review){
		Review addReviews=new Review(review, film_film_id);
		reviewRepository.save(addReviews);
		return save;
	}




	@GetMapping("/AllCities")
	public @ResponseBody
	Iterable<City> getAllCities(){
		return cityRepository.findAll();
	}



	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}
}
