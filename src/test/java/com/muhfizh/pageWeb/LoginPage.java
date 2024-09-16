package com.muhfizh.pageWeb;

import com.muhfizh.Utility.BaseRun;
import org.openqa.selenium.By;

public class LoginPage extends BaseRun {

    By UsernameTxt = By.xpath("//*[@type = 'text' and @id = 'loginusername']");
    By PasswordTxt = By.xpath("//*[@type = 'password' and @id = 'loginpassword']");
    By LoginBTN = By.xpath("//*[@onclick='logIn()']");

    public void inputUsernameLogin(String Username){
        driver.findElement(UsernameTxt).sendKeys(Username);
    }

    public void inputPasswordLogin(String Password){
        driver.findElement(PasswordTxt).sendKeys(Password);
    }

    public void kliklogin(){
        driver.findElement(LoginBTN).click();
    }

}
