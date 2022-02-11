package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.City;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    private City cityTest = new City("FakeCityName");

    @Test
    void getCity_id() {
        assertEquals(0, cityTest.getCity_id(), "Failed test");
    }

    @Test
    void getCountry_id() {
        assertEquals(0, cityTest.getCountry_id(), "Failed test");
    }

    @Test
    void getCity() {
        assertEquals("FakeCityName", cityTest.getCity(), "Incorrect first name, Failed test.");

    }

    @Test
    void setCity() {
        assertEquals("FakeCityName", cityTest.getCity(), "Incorrect first name, Failed test.");

    }
}