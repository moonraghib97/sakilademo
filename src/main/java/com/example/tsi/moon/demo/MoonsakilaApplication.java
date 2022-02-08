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

	public MoonsakilaApplication(LanguageRepository languageRepository){
		this.languageRepository = languageRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MoonsakilaApplication.class, args);

	}

	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}
}
