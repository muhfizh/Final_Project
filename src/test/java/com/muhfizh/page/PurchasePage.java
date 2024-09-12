package com.muhfizh.page;

import com.muhfizh.Runner.BaseRun;
import org.openqa.selenium.By;

public class PurchasePage extends BaseRun {

    By NamaInput = By.id("name");
    By CountryInput = By.id("country");
    By CityInput = By.id("city");
    By CardInput = By.id("card");
    By MonthInput = By.id("month");
    By YearInput = By.id("year");
    By PurchaseBTN = By.xpath("//*[@onclick='purchaseOrder()']");

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

}
