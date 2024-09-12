package com.muhfizh.Runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseRun {

        @Before
        public void beforeTest() {
            getDriver();
        }

        @After
        public void afterTest() {
            getclosed();
        }
}
