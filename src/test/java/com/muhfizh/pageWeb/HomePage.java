package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BaseRun {
    By productTitle = By.id("nava");
    By LoginLabel   = By.id("login2");
    By SignupLabel   = By.id("signin2");
    By HomeLabel   = By.xpath("//a[@href = 'index.html' and (text() = 'Home (current)' or . = 'Home (current)')]");
    By CartLabel = By.xpath("//a[@id = 'cartur' and @href = 'cart.html' and (text() = 'Cart' or . = 'Cart')]");
    By CategoryPhone = By.xpath("//*[@id=\"itemc\" and (text() = \"Phones\" or . = \"Phones\")]");
    By CategoryLaptop = By.xpath("//*[@id=\"itemc\" and (text() = \"Laptops\" or . = \"Laptops\")]");
    By CategoryMonitor = By.xpath("//*[@id=\"itemc\" and (text() = \"Monitors\" or . = \"Monitors\")]");

    public void GotoHomepage() {
        driver.get("https://www.demoblaze.com/");
    }

    public void validasihomepage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("PRODUCT STORE", productElement.getText());
    }

    public void kliklabelsignup(){
        driver.findElement(SignupLabel).click();
    }

    public void kliklabellogin(){
        driver.findElement(LoginLabel).click();
    }

    public void kliklabelhome(){
        driver.findElement(HomeLabel).click();
    }

    public void kliklabelcart(){
        driver.findElement(CartLabel).click();
    }

    public void klikKategori(String kategory){
        switch (kategory) {
            case "Phone":
                driver.findElement(CategoryPhone).click();
            case "Laptop":
                driver.findElement(CategoryLaptop).click();
            case "Monitor":
                driver.findElement(CategoryMonitor).click();
        }
    }

    public void ValidasiPesan(String errorMessage) {
        wait.until(ExpectedConditions.alertIsPresent());
        String actualText = driver.switchTo().alert().getText();
        Assert.assertTrue(actualText.contains(errorMessage));
        driver.switchTo().alert().dismiss();
    }

}
