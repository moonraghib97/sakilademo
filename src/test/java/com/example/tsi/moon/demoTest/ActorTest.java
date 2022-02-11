package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Film;
import com.example.tsi.moon.demo.Language;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    private Actor actorTest = new Actor("Fake", "FakeLastName");
    private Set<Film> testFilm = new HashSet<>();

    @Test
    public void testGetActorId(){
        assertEquals(0, actorTest.getActor_id(), "Failed test");
    }

    @Test
    public void getFirst_name() {
        assertEquals("Fake", actorTest.getFirst_name(), "Incorrect first name, Failed test.");
    }

    @Test
    public void setFirst_name() {
        assertEquals("Fake", actorTest.getFirst_name(), "Test failed");
    }

    @Test
    public void getLast_name() {
        assertEquals("FakeLastName", actorTest.getLast_name(), "Incorrect last name, Failed test.");
    }

    @Test
    public void setLast_name() {
        assertEquals("FakeLastName", actorTest.getLast_name(), "Test failed");
    }

    @Test
    public void getFilms() {

        Set<Film> testFilmSet = new HashSet<>();
        actorTest.setFilms(testFilmSet);
        assertEquals(testFilmSet, actorTest.getFilms(),"This test has failed");
    }

    @Test
    public void setFilms() {
        Set<Film> testFilmSet = new HashSet<>();
        testFilmSet.add(new Film("Test title", "Test description", 1, 1, 1,
                22.55, 1, 50.50, "Test rating", "Test special features"));
        actorTest.setFilms(testFilmSet);
        assertEquals(testFilmSet, actorTest.getFilms(),"This test has failed");
    }
}