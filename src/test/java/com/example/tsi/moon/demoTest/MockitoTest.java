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

    @BeforeEach
    void Setup(){
        moonsakilaApplication = new MoonsakilaApplication(languageRepository, actorRepository, categoryRepository,
                inventoryRepository, filmRepository, cityRepository);
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
}
