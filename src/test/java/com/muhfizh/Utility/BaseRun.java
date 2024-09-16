package com.muhfizh.Utility;

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
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm=usage");
        options.addArguments("--remote-allow=origin=*");
        options.addArguments("--window-size=1920,1080");

        WebDriverManager.chromedriver().clearDriverCache().setup();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public static void GetClosed(){
        driver.close();
        driver.quit();
    }
}
