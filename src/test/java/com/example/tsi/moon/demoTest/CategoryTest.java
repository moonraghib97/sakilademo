package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    private Category category = new Category();

    @Test
    public void testName() {
        Category testName = new Category();
        testName.setName("FakeCategory");
        assertEquals("FakeCategory", testName.getName(), "Failed Test");
    }

    @Test
    public void testGetCategory_id(){
        assertEquals(0, category.getCategory_id(), "Failed Test");
    }

    @Test
    public void test_constructor() {
        assertTrue(category instanceof Category, "Not an instance of Category");
    }

}