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


}
