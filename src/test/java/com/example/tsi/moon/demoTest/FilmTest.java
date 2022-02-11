package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Film;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {
    private Film filmTest = new Film("FakeTitle", "FakeDescription", 0, 0, 0,
    5.50, 0, 5.50, "FakeRating",
    "FakeSpecialFeatures");
    private Set<Actor> testActor = new HashSet<>();

    @Test
    void getFilm_id() {
        assertEquals(0,filmTest.getFilm_id(),"Failed Test");
    }

    @Test
    void setFilm_id() {
        filmTest.setFilm_id(2);
        assertEquals(2,filmTest.getFilm_id(),"Failed Test");
    }

    @Test
    void getLanguage_id() {
        assertEquals(0,filmTest.getLanguage_id(),"Failed Test");
    }

    @Test
    void setLanguage_id() {
        filmTest.setLanguage_id(2);
        assertEquals(2,filmTest.getLanguage_id(),"Failed Test");
    }

    @Test
    void getTitle() {
        assertEquals("FakeTitle",filmTest.getTitle(),"Failed Test");
    }

    @Test
    void setTitle() {
        filmTest.setTitle("FakeTitle2");
        assertEquals("FakeTitle2",filmTest.getTitle(),"FailedTest");
    }

    @Test
    void getDescription() {
        assertEquals("FakeDescription",filmTest.getDescription(),"Failed Test");
    }

    @Test
    void setDescription() {
        filmTest.setDescription("Description2");
        assertEquals("Description2",filmTest.getDescription(),"Failed Test");
    }

    @Test
    void getRelease_year() {
        assertEquals(0,filmTest.getRelease_year(),"Failed Test");
    }

    @Test
    void setRelease_year() {
        filmTest.setRelease_year(2030);
        assertEquals(2030,filmTest.getRelease_year(),"Failed Test");
    }

    @Test
    void getRental_duration() {
        assertEquals(0,filmTest.getRental_duration(),"Failed Test");
    }

    @Test
    void setRental_duration() {
        filmTest.setRental_duration(55);
        assertEquals(55,filmTest.getRental_duration(),"Failed Test");
    }

    @Test
    void getRental_rate() {
        assertEquals(5.50,filmTest.getRental_rate(),"Failed Test");
    }

    @Test
    void setRental_rate() {

        filmTest.setRental_rate(55);
        assertEquals(55,filmTest.getRental_rate(),"Failed Test");
    }

    @Test
    void getLength() {
        assertEquals(0,filmTest.getLength(),"Failed Test");

    }

    @Test
    void setLength() {
        filmTest.setLength(5);
        assertEquals(5,filmTest.getLength(),"Failed Test");
    }

    @Test
    void getReplacement_cost() {
        assertEquals(5.5,filmTest.getReplacement_cost(),"Failed Test");
    }

    @Test
    void setReplacement_cost() {
        filmTest.setReplacement_cost(2.50);
        assertEquals(2.50,filmTest.getReplacement_cost(),"Failed Test");
    }

    @Test
    void getRating() {
        assertEquals("FakeRating",filmTest.getRating(),"Failed Test");
    }

    @Test
    void setRating() {
        filmTest.setRating("NewRating");
        assertEquals("NewRating",filmTest.getRating(),"Failed Test");
    }

    @Test
    void getSpecial_features() {
        assertEquals("FakeSpecialFeatures",filmTest.getSpecial_features(),"Failed Test");
    }

    @Test
    void setSpecial_features() {
        filmTest.setSpecial_features("Feature2");
        assertEquals("Feature2",filmTest.getSpecial_features(),"Failed Test");
    }



    @Test
    void getActor() {
        Set<Actor> testActorSet = new HashSet<>();
        filmTest.setActor(testActorSet);
        assertEquals(testActorSet, filmTest.getActor(),"Failed Test");
    }

    @Test
    void setActor() {
        Set<Actor> testActorSet = new HashSet<>();
        testActorSet.add(new Actor("FakeOne","FakeTwo"));
        filmTest.setActor(testActorSet);
        assertEquals(testActorSet, filmTest.getActor(),"Failed Test");

    }
}