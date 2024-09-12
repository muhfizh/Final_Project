package com.muhfizh.StepDefWeb;

import com.muhfizh.Runner.BaseRun;
import com.muhfizh.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.muhfizh.page.LoginPage;

public class SignUpStepDef {

    LoginPage loginPage;
    HomePage homePage;

    public SignUpStepDef(){
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
    }

    @Given("pengguna berada pada tampilan daftar")
    public void TampilanSignUp() {
        homePage.GotoHomepage();
    }

    @And("pengguna memasukan username dengan {string}")
    public void InputUsernameSignUp(String Username) {
        loginPage.inputUsernameSignUp(Username);
    }

    @And("pengguna memasukan password dengan {string}")
    public void InputPasswordSignUp(String Password) {
        loginPage.inputPasswordSignUp(Password);
    }

    @When("pengguna menekan tombol sign up")
    public void MenekanTombolSignUp() {
        loginPage.klikSignUp();
    }

    @Then("muncul pesan {string}")
    public void ValidasiPesanSignUp(String pesan) {
        homePage.ValidasiPesan(pesan);
    }
}
