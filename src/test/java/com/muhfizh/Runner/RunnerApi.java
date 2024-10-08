package com.muhfizh.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.muhfizh.StepDefApi"},
        features = {"src/test/java/com/muhfizh/feature/Api.feature"},
        plugin = {"pretty"},
        tags = "@api")

public class RunnerApi {
}
