package com.muhfizh.Runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseRun {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void getDriver(){
        ChromeOptions chrome = new ChromeOptions();

        chrome.addArguments("--headless");
        chrome.addArguments("--no-sandbox");
        chrome.addArguments("--disable-dev-shm-usage");
        chrome.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.demoblaze.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void getclosed(){
        driver.close();
        driver.quit();
    }
}
