package com.example.tsi.moon.demoTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/Cucumber", glue = "com.example.tsi.moon.demoTest")
public class runCucumberTest {

}
