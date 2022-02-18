package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    @Test
    public void testName() {

        Category testName = new Category();
        testName.setName("Horror");
        assertEquals("Horror", testName.getName(), "Incorrect name!");
    }


    private Category category = new Category();

    @Test
    public void test_constructor() {
        assertTrue(category instanceof Category, "Not an instance of Category");
    }

    @Test
    public void testGetCategory_id(){
        assertEquals(0, category.getCategory_id(), "Category id getting failed");
    }
}