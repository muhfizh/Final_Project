package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;

public class SignUpPage extends BaseRun {

    By UsernameSgn = By.xpath("//*[@type = 'text' and @id = 'sign-username']");
    By PasswordSgn = By.xpath("//*[@type = 'password' and @id = 'sign-password']");
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
