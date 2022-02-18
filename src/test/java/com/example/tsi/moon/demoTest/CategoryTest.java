package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    private Category categoryTest = new Category("FakeName");


    @Test
    void getCategory_id() {
        assertEquals(0, categoryTest.getCategory_id(), "Failed test");
    }

    @Test
    void getName() {
        assertEquals("FakeName", categoryTest.getName(), "Incorrect first name, Failed test.");

    }

    @Test
    void setName() {
        assertEquals("FakeName", categoryTest.getName(), "Test failed");

    }

    @Test
    public void test_constructor(){
        assertTrue(categoryTest instanceof Category, "Not an instance of Category");
    }
}