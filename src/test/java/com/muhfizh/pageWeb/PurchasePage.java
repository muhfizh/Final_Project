package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        driver.findElement(NamaInput).sendKeys(Name);
    }

    public void InputCountry(String Country){
        driver.findElement(CountryInput).sendKeys(Country);
    }

    public void InputCity(String City){
        driver.findElement(CityInput).sendKeys(City);
    }

    public void InputCard(String Card){
        driver.findElement(CardInput).sendKeys(Card);
    }

    public void InputMonth(String Month){
        driver.findElement(MonthInput).sendKeys(Month);
    }

    public void InputYear(String Year){
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

    public void validasiNamaSuccess(String nama){
        WebElement namaSuccess = driver.findElement(NameMsg(nama));
        assertTrue(namaSuccess.isDisplayed());
        assertEquals(nama, namaSuccess.getText());
    }

    public void KlikOke(){
        driver.findElement(BTNOke).click();
    }

}
