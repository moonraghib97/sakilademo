package com.example.tsi.moon.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
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
		this.reviewRepository = reviewRepository;
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
	@GetMapping("/AllLanguage")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}

	@GetMapping("/GetLanguage/{language_id}")
	public @ResponseBody
	Optional<Language> getLanguageByID(@PathVariable int language_id){
		return languageRepository.findById(language_id);
	}




	@PostMapping("/AddActor")
	public @ResponseBody String addActor(@RequestParam String first_name, @RequestParam String last_name){
		Actor addActor = new Actor(first_name, last_name);
		actorRepository.save(addActor);
		return save;
	}
	@GetMapping("/AllActor")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}
	@GetMapping("/GetActors/{actor_id}")
	public @ResponseBody
	Optional<Actor> getActorByID(@PathVariable int actor_id){
		return actorRepository.findById(actor_id);
	}




	@PostMapping("/AddCategory")
	public @ResponseBody String addCategory(@RequestParam String name){
		Category addCategory = new Category(name);
		categoryRepository.save(addCategory);
		return save;
	}
	@GetMapping("/AllCategory")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}




	@PostMapping("/AddReview")
	public @ResponseBody
	String addReviews(@RequestParam int film_film_id, String review){
		Review addReviews=new Review(film_film_id, review);
		reviewRepository.save(addReviews);
		return save;
	}
	@GetMapping("/AllReview")
	public @ResponseBody
	Iterable<Review>getAllReview(){
		return reviewRepository.findAll();
	}






	@PostMapping("/addFilm")
	public @ResponseBody String addFilm(@RequestParam String title, String description, int release_year, int language_id, int rental_duration,
										double rental_rate, int length, double replacement_cost, String rating,
										String special_features) {

		Film addFilm = new Film(title, description, release_year, language_id, rental_duration, rental_rate, length,
				replacement_cost, rating, special_features);

		filmRepository.save(addFilm);
		return save;
	}
	@GetMapping("/AllFilm")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}




	@PostMapping("/AddInventory")
	public @ResponseBody
	String addInventory(@RequestParam int inventory_id, int film_id, int store_id){
		Inventory addInventory = new Inventory(inventory_id, film_id, store_id);
		inventoryRepository.save(addInventory);
		return save;
	}
	@GetMapping("/AllInventory")
	public @ResponseBody
	Iterable<Inventory>getAllInventory(){
		return inventoryRepository.findAll();
	}





	@PostMapping("/AddCity")
	public @ResponseBody
	String addCity(@RequestParam String city){
		City addCity = new City(city);
		cityRepository.save(addCity);
		return save;
	}
	@GetMapping("/AllCity")
	public @ResponseBody
	Iterable<City> getAllCities(){
		return cityRepository.findAll();
	}

}
