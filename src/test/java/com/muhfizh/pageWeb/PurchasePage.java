package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PurchasePage extends BaseRun {

    By NamaInput = By.id("name");
    By CountryInput = By.id("country");
    By CityInput = By.id("city");
    By CardInput = By.id("card");
    By MonthInput = By.id("month");
    By YearInput = By.id("year");
    By PurchaseBTN = By.xpath("//*[@onclick='purchaseOrder()']");
    By SuccessMSG = By.xpath("//*[(text() = 'Thank you for your purchase!' or . = 'Thank you for your purchase!')]");
    By NameMsg(String name){
        return By.xpath("//*[(contains(text(), '"+name+"') or contains(., '"+name+"'))]");
    };
    By BTNOke = By.xpath("//*[(text() = 'OK' or . = 'OK')]");
    public void InputName(String Name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(NamaInput));
        wait.until(ExpectedConditions.elementToBeClickable(NamaInput));
        driver.findElement(NamaInput).sendKeys(Name);
    }

    public void InputCountry(String Country){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryInput));
        wait.until(ExpectedConditions.elementToBeClickable(CountryInput));
        driver.findElement(CountryInput).sendKeys(Country);
    }

    public void InputCity(String City){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityInput));
        wait.until(ExpectedConditions.elementToBeClickable(CityInput));
        driver.findElement(CityInput).sendKeys(City);
    }

    public void InputCard(String Card){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CardInput));
        wait.until(ExpectedConditions.elementToBeClickable(CardInput));
        driver.findElement(CardInput).sendKeys(Card);
    }

    public void InputMonth(String Month){
        wait.until(ExpectedConditions.visibilityOfElementLocated(MonthInput));
        wait.until(ExpectedConditions.elementToBeClickable(MonthInput));
        driver.findElement(MonthInput).sendKeys(Month);
    }

    public void InputYear(String Year){
        wait.until(ExpectedConditions.visibilityOfElementLocated(YearInput));
        wait.until(ExpectedConditions.elementToBeClickable(YearInput));
        driver.findElement(YearInput).sendKeys(Year);
    }

    public void klikPurchase(){
        driver.findElement(PurchaseBTN).click();
    }

    public void validasiSuccess(String pesan){
        WebElement successMSG = driver.findElement(SuccessMSG);
        assertTrue(successMSG.isDisplayed());
        assertEquals(pesan, successMSG.getText());
    }
}
