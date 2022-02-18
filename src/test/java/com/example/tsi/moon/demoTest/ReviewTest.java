package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Film;
import com.example.tsi.moon.demo.Review;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReviewTest {
    private Review review = new Review();

    @Test
    public void testFilmId() {

        Review testFilmId = new Review();
        testFilmId.setFilm_film_id(1);
        assertEquals(1, testFilmId.getFilm_film_id(), "Test Failed");
    }

    @Test
    public void testConsumerReview() {

        Review testReview = new Review();
        testReview.setReview("stuff");
        assertEquals("stuff", testReview.getReview(), "Test Failed");
    }


    @Test
    public void test_constructor() {
        assertTrue(review instanceof Review, "Not an instance of Review");
    }
}

