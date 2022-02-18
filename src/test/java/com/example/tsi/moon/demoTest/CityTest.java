package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Category;
import com.example.tsi.moon.demo.City;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    private City city = new City("FakeCityName");

    @Test
    public void testCity() {
        City testCity = new City();
        testCity.setCity("FakeCity");
        assertEquals("FakeCity", testCity.getCity(), "Failed Test");
    }

    @Test
    public void testCountryID() {
        City testCountryID = new City();
        testCountryID.setCountry_id(0);
        assertEquals(0, testCountryID.getCountry_id(), "Failed Test");
    }

    @Test
    public void testGetCityID(){
        assertEquals(0, city.getCity_id(), "Failed Test");
    }

    @Test
    public void test_constructor() {
        assertTrue(city instanceof City, "Not an instance of City");
    }
}