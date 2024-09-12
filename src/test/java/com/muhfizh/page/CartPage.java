package com.muhfizh.page;

import com.muhfizh.Runner.BaseRun;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BaseRun {

    By PlaceOrderBTN = By.xpath("//button[@type = 'button' and (text() = 'Place Order' or . = 'Place Order')]");

    public void placeorder(){
        driver.findElement(PlaceOrderBTN).click();
    }
}
