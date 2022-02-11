package com.example.tsi.moon.demoTest;
import com.example.tsi.moon.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class MockitoTest {
    private MoonsakilaApplication moonsakilaApplication;
    @Mock
    private LanguageRepository languageRepository; //fake database

    @Mock
    private ActorRepository actorRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private InventoryRepository inventoryRepository;

    @Mock
    private FilmRepository filmRepository;

    @Mock
    private CityRepository cityRepository;

    @Mock
    private ReviewRepository reviewRepository;


    @BeforeEach
    void Setup(){
        moonsakilaApplication = new MoonsakilaApplication(languageRepository, actorRepository,
                categoryRepository, inventoryRepository, filmRepository, cityRepository, reviewRepository);
    }

    @Test
    public void testAddLanguage(){
        Language saveLanguage = new Language("Test language");
        String expected = "save";
        String actual = moonsakilaApplication.addLanguage(saveLanguage.getName());
        ArgumentCaptor<Language>languageArgumentCaptor = ArgumentCaptor.forClass(Language.class);
        verify(languageRepository).save(languageArgumentCaptor.capture());
        languageArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Data d=hasnt been added to mockDB");
    }

    @Test
    public void testAddActor(){
        Actor saveActor = new Actor("Testfirst", "Testsecond");
        String expected = "save";
        String actual = moonsakilaApplication.addActor(saveActor.getFirst_name(),saveActor.getLast_name());
        ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
        verify(actorRepository).save(actorArgumentCaptor.capture());
        actorArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual,"New data for actor has not been added to the mock DB");
    }

    @Test
    public void testAddCategory(){
        Category saveCategory = new Category("categoryTest");
        String expected = "save";
        String actual = moonsakilaApplication.addCategory(saveCategory.getName());
        ArgumentCaptor<Category> categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class);
        verify(categoryRepository).save(categoryArgumentCaptor.capture());
        categoryArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual,"New data for category has not been added to the mock DB");
    }

    @Test
    public void testAddInventory(){
        Inventory saveInventory = new Inventory(1, 2, 3);
        String expected = "save";
        String actual = moonsakilaApplication.addInventory(saveInventory.getInventory_id(), saveInventory.getFilm_id(),
                saveInventory.getStore_id());
        ArgumentCaptor<Inventory> inventoryArgumentCaptor = ArgumentCaptor.forClass(Inventory.class);
        verify(inventoryRepository).save(inventoryArgumentCaptor.capture());
        inventoryArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "New data for inventory has not been added to the mock DB");
    }


    @Test
    public void testAddFilm(){
        Film saveFilm = new Film("Film title", "Film description", 2340, 1, 40, 55.34, 10, 2.99, "Film rating",
                "Film special feature");
        String expected = "save";
        String actual = moonsakilaApplication.addFilm(saveFilm.getTitle(), saveFilm.getDescription(),
                saveFilm.getRelease_year(), saveFilm.getLanguage_id(), saveFilm.getRental_duration(),
                saveFilm.getRental_rate(), saveFilm.getLength(), saveFilm.getReplacement_cost(), saveFilm.getRating(),
                saveFilm.getSpecial_features());
        ArgumentCaptor<Film> filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);
        verify(filmRepository).save(filmArgumentCaptor.capture());
        filmArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual,"New data for Film has not been added to the mock DB");
    }

    @Test
    public void testAddCity(){
        City saveCity = new City("Random City");
        String expected = "save";
        String actual = moonsakilaApplication.addCity(saveCity.getCity());
        ArgumentCaptor<City> cityArgumentCaptor = ArgumentCaptor.forClass(City.class);
        verify(cityRepository).save(cityArgumentCaptor.capture());
        cityArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual,"Staff data has not been entered into the mock database");
    }

    @Test
    public void testAddReview(){
        Review saveReview = new Review(22, "Review for film");
        String expected = "save";
        String actual = moonsakilaApplication.addReviews(saveReview.getFilm_film_id(), saveReview.getReview());
        ArgumentCaptor<Review> reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
        verify(reviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual,"Staff data has not been entered into the mock database");
    }

}
