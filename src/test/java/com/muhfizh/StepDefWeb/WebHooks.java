package com.muhfizh.StepDefWeb;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.muhfizh.Utility.BaseRun.getDriver;
import static com.muhfizh.Utility.BaseRun.GetClosed;


public class WebHooks {

        @Before
        public void beforeTest() {
            getDriver();
        }

        @After
        public void afterTest() {
            GetClosed();
        }
}
