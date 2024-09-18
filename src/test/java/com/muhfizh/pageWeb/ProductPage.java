package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BaseRun {

    By ProductTitle(String product) {
        return By.xpath("//a[contains(text(),'"+product+"')]");
    }
    By AddToCartBTN = By.xpath("//*[text()='Add to cart']");

    public void klikproduct(String product){
            wait.until(ExpectedConditions.visibilityOfElementLocated(ProductTitle(product)));
            wait.until(ExpectedConditions.elementToBeClickable(ProductTitle(product)));
            driver.findElement(ProductTitle(product)).click();
    }

    public void klikaddtocart(){
        driver.findElement(AddToCartBTN).click();
    }

}
