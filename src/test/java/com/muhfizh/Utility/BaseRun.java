package com.muhfizh.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.demoblaze.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static void GetClosed(){
        driver.close();
        driver.quit();
    }

    public static String GenerateName(){
        String username = RandomStringUtils.randomAlphanumeric(10);
        return username;
    }
    public static String GeneratePassword(){
        String password = RandomStringUtils.randomAlphanumeric(8);
        return password;
    }
}
