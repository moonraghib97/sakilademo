package com.example.tsi.moon.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private int inventory_id;
    private int film_id;
    private int store_id;

    public Inventory(int inventory_id, int film_id, int store_id){
        this.inventory_id = inventory_id;
        this.film_id = film_id;
        this.store_id = store_id;

    }

    public Inventory(){

    }

    public int getInventory_id() {
        return inventory_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }
}