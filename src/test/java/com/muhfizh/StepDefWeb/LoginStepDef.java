package com.muhfizh.StepDefWeb;

import com.muhfizh.pageWeb.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.muhfizh.pageWeb.LoginPage;

public class LoginStepDef {

    LoginPage loginPage;
    HomePage homePage;

    public LoginStepDef(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Given("pengguna berada pada tampilan login")
    public void TampilanLogin() {
        homePage.GotoHomepage();
    }

    @And("pengguna memasukan username dengan {string} dihalaman login")
    public void InputUsernameLogin(String username) {
        loginPage.inputUsernameLogin(username);
    }

    @And("pengguna memasukan password dengan {string} dihalaman login")
    public void InputPasswordLogin(String password) {
        loginPage.inputPasswordLogin(password);
    }

    @When("pengguna menekan tombol login")
    public void MenekanTombolLogin() {
        loginPage.kliklogin();
    }

    @Then("pengguna gagal login dengan pesan {string}")
    public void ValidasiPesanGagal(String pesan) {
        homePage.ValidasiPesan(pesan);
    }

    @And("pengguna menekan label login")
    public void penggunaMenekanLabelLogin() {
        homePage.kliklabellogin();
    }
}
