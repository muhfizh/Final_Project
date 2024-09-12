package com.muhfizh.page;

import com.muhfizh.Runner.BaseRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BaseRun {

    By UsernameTxt = By.id("loginusername");
    By PasswordTxt = By.id("loginpassword");
    By LoginBTN = By.xpath("//*[@onclick='logIn()']");
    By Login = By.id("logInModalLabel");
    By Signup = By.id("signInModalLabel");
    By UsernameSgn = By.id("sign-username");
    By PasswordSgn = By.id("sign-password");
    By SignUpBTN = By.xpath("//*[@onclick='register()']");

    public void tampilanlogin(){
            WebElement LoginElement = driver.findElement(Login);
            assertTrue(LoginElement.isDisplayed());
            assertEquals("Login", LoginElement.getText());
    }

    public void tampilansignup(){
        WebElement SignupElement = driver.findElement(Signup);
        assertTrue(SignupElement.isDisplayed());
        assertEquals("Sign Up", SignupElement.getText());
    }
    public void inputUsernameLogin(String Username){
        driver.findElement(UsernameTxt).sendKeys(Username);
    }

    public void inputPasswordLogin(String Password){
        driver.findElement(PasswordTxt).sendKeys(Password);
    }

    public void kliklogin(){
        driver.findElement(LoginBTN).click();
    }

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
