package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;

public class CartPage extends BaseRun{

    By PlaceOrderBTN = By.xpath("//button[@type = 'button' and (text() = 'Place Order' or . = 'Place Order')]");


    public void placeorder(){
        driver.findElement(PlaceOrderBTN).click();
    }
}
