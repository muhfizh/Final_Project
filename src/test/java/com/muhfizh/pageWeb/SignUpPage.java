package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;

public class SignUpPage extends BaseRun {

    By UsernameSgn = By.id("sign-username");
    By PasswordSgn = By.id("sign-password");
    By SignUpBTN = By.xpath("//*[@onclick='register()']");

    public void inputUsernameSignUp(String Username){
        driver.findElement(UsernameSgn).sendKeys(Username);
    }

    public void inputPasswordSignUp(String Password){
        driver.findElement(PasswordSgn).sendKeys(Password);
    }

    public void klikSignUp(){
        driver.findElement(SignUpBTN).click();
    }


}
