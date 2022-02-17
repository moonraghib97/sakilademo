package com.example.tsi.moon.demoTest;

import com.example.tsi.moon.demo.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LanguageTest {
    private Language languageTest = new Language("FakeLanguage");

    @Test
    public void getName() {
        assertEquals("FakeLanguage", languageTest.getName(), "Failed test");
    }

    @Test
    public void setName() {
        languageTest.setName("FakeNameTwo");
        assertEquals("FakeNameTwo",languageTest.getName(),"Failed Test");
    }

    @Test
    public void getLanguage_id() {
        assertEquals(0,languageTest.getLanguage_id(),"Failed Test");
    }

    @Test
    public void emptyConstructor() {
        languageTest = new Language();
        assertEquals(null, languageTest.getName(), "Failed Test");
    }
}