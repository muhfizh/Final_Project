package com.muhfizh.StepDefWeb;

import com.muhfizh.pageWeb.HomePage;
import com.muhfizh.pageWeb.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDef {

    SignUpPage signUpPage;
    HomePage homePage;

    public SignUpStepDef(){
        homePage = new HomePage();
        signUpPage = new SignUpPage();
    }

    @Given("pengguna berada pada tampilan daftar")
    public void TampilanSignUp() {
        homePage.GotoHomepage();
    }

    @And("pengguna memasukan username dengan {string}")
    public void InputUsernameSignUp(String Username) {
        signUpPage.inputUsernameSignUp(Username);
    }

    @And("pengguna memasukan password dengan {string}")
    public void InputPasswordSignUp(String Password) {
        signUpPage.inputPasswordSignUp(Password);
    }

    @When("pengguna menekan tombol sign up")
    public void MenekanTombolSignUp() {
        signUpPage.klikSignUp();
    }

    @Then("muncul pesan {string}")
    public void ValidasiPesanSignUp(String pesan) {
        homePage.ValidasiPesan(pesan);
    }
}
