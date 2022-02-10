package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class MoonsakilaApplicationTests {
    private Language language = new Language();
    private Film film = new Film();
    private City city = new City();
    private Actor actor = new Actor();
    private Category category = new Category();
    private Inventory inventory = new Inventory();

    @Test
    public void test_getLanguage(){
        language.setName("testname");
        assertEquals("testname",language.getName());

    }
    @Test
    public void test_getCategory(){
        category.setName("testname");
        assertEquals("testname", category.getName());
    }


    @Test
    public void test_getCity(){
        city.setCity("testcity");
        assertEquals("testcity",city.getCity());

    }



}
