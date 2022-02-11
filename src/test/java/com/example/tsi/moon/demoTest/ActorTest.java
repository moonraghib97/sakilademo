package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Actor;
import com.example.tsi.moon.demo.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    Actor actorTest = new Actor("TestName","testLastName");

    @Test
    public void testGetActorId(){
        assertEquals(0, actorTest.getActor_id(), "Failed test");
    }

    @Test
    public void getFirst_name() {
    }

    @Test
    public void setFirst_name() {
    }

    @Test
    public void getLast_name() {
    }

    @Test
    public void setLast_name() {
    }

    @Test
    public void getFilms() {
    }

    @Test
    public void setFilms() {
    }
}