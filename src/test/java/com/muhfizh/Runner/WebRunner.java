package com.muhfizh.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"StepDefWeb"},
        features = {"src/test/java/com/muhfizh/feature/Web.feature"},
        plugin = {"pretty"},
        tags = "@web")

public class WebRunner {
}
