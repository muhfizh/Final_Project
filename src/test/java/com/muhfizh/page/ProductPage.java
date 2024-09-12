package com.muhfizh.page;

import com.muhfizh.Runner.BaseRun;
import org.openqa.selenium.By;

public class ProductPage extends BaseRun {

    By Samsung_galaxy_s6 = By.xpath("//a[(text() = 'Samsung galaxy s6' or . = 'Samsung galaxy s6')]");
    By Nokia_lumia_1520 = By.xpath("//a[(text() = 'Nokia lumia 1520' or . = 'Nokia lumia 1520')]");
    By Nexus_6 = By.xpath("//a[(text() = 'Nexus 6' or . = 'Nexus 6')]");
    By Samsung_galaxy_s7 = By.xpath("//a[(text() = 'Samsung galaxy s7' or . = 'Samsung galaxy s7')]");
    By Iphone_6_32gb = By.xpath("//a[(text() = 'Iphone 6 32gb' or . = 'Iphone 6 32gb')]");
    By Sony_xperia_z5 = By.xpath("//a[(text() = 'Sony xperia z5' or . = 'Sony xperia z5')]");
    By HTC_One_M9 = By.xpath("//a[(text() = 'HTC One M9' or . = 'HTC One M9')]");
    By Sony_vaio_i5 = By.xpath("//a[(text() = 'Sony vaio i5' or . = 'Sony vaio i5')]");
    By Sony_vaio_i7 = By.xpath("//a[(text() = 'Sony vaio i7' or . = 'Sony vaio i7')]");
    By MacBook_air = By.xpath("//a[(text() = 'MacBook air' or . = 'MacBook air')]");
    By Dell_i7_8gb = By.xpath("//a[(text() = 'Dell i7 8gb' or . = 'Dell i7 8gb')]");
    By p2017Dell156Inch = By.xpath("//a[(text() = '2017 Dell 15.6 Inch' or . = '2017 Dell 15.6 Inch')]");
    By MacBook_Pro = By.xpath("//a[(text() = 'MacBook Pro' or . = 'MacBook Pro')]");
    By Apple_monitor_24 = By.xpath("//a[(text() = 'Apple monitor 24' or . = 'Apple monitor 24')]");
    By ASUS_Full_HD = By.xpath("//a[(text() = 'ASUS Full HD' or . = 'ASUS Full HD')]");
    By AddToCartBTN = By.xpath("//*[text()='Add to cart']");

    public void klikproduct(String product){
        switch (product){
            case "Samsung galaxy s6" :
                driver.findElement(Samsung_galaxy_s6).click();
            case "Nokia lumia 1520" :
                driver.findElement(Nokia_lumia_1520).click();
            case "Nexus 6" :
                driver.findElement(Nexus_6).click();
            case "Samsung galaxy s7" :
                driver.findElement(Samsung_galaxy_s7).click();
            case "Iphone 6 32gb" :
                driver.findElement(Iphone_6_32gb).click();
            case "Sony xperia z5" :
                driver.findElement(Sony_xperia_z5).click();
            case "HTC One M9" :
                driver.findElement(HTC_One_M9).click();
            case "Sony vaio i5" :
                driver.findElement(Sony_vaio_i5).click();
            case "Sony vaio i7" :
                driver.findElement(Sony_vaio_i7).click();
            case "MacBook air" :
                driver.findElement(MacBook_air).click();
            case "Dell i7 8gb" :
                driver.findElement(Dell_i7_8gb).click();
            case "2017 Dell 15.6 Inch" :
                driver.findElement(p2017Dell156Inch).click();
            case "MacBook Pro" :
                driver.findElement(MacBook_Pro).click();
            case "Apple monitor 24" :
                driver.findElement(Apple_monitor_24).click();
            case "ASUS Full HD" :
                driver.findElement(ASUS_Full_HD).click();
        }
    }

    public void klikaddtocart(){
        driver.findElement(AddToCartBTN).click();
    }

}
