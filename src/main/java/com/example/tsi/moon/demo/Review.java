package com.example.tsi.moon.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_film_id;
    private String review;

    @ManyToOne
    @JsonIgnore
    @JoinColumn (name = "film_id", referencedColumnName = "film_id", updatable = false, insertable = false)
    private Film film;


    public Review(int film_film_id, String review){

        this.film_film_id = film_film_id;
        this.review = review;
    }

    public Review(){

    }


    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public int getFilm_film_id() {
        return film_film_id;
    }

    public void setFilm_film_id(int film_film_id) {
        this.film_film_id = film_film_id;
    }

    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
}