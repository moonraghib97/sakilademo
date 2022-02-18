package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Film;
import com.example.tsi.moon.demo.Inventory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    private Inventory inventoryTest = new Inventory(0, 0, 0);

    @Test
    void getInventory_id() {
        assertEquals(0, inventoryTest.getInventory_id(), "Failed test");
    }

    @Test
    void getFilm_id() {
        assertEquals(0,inventoryTest.getFilm_id(),"Failed Test");
    }

    @Test
    void setFilm_id() {
        inventoryTest.setFilm_id(2);
        assertEquals(2,inventoryTest.getFilm_id(),"Failed Test");
    }

    @Test
    void getStore_id() {
        assertEquals(0,inventoryTest.getStore_id(),"Failed Test");
    }

    @Test
    void setStore_id() {
        inventoryTest.setStore_id(10);
        assertEquals(10,inventoryTest.getStore_id(),"Failed Test");
    }

    @Test
    public void test_constructor(){
        assertTrue(inventoryTest instanceof Inventory, "Not an instance of Inventory");
    }
}