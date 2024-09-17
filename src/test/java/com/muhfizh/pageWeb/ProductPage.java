package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class ProductPage extends BaseRun {

    By ProductTitle(String product) {
        return By.xpath("//a[contains(text(),'"+product+"')]");
    }
    By AddToCartBTN = By.xpath("//*[text()='Add to cart']");

    public void klikproduct(String product){
        try{
            driver.findElement(ProductTitle(product)).click();
        } catch (StaleElementReferenceException e) {
            driver.findElement(By.xpath("//a[contains(text(),'"+product+"')]")).click();
        }

    }

    public void klikaddtocart(){
        driver.findElement(AddToCartBTN).click();
    }

}
