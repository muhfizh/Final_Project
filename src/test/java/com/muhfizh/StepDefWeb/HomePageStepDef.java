package com.muhfizh.StepDefWeb;

import com.muhfizh.pageWeb.HomePage;
import com.muhfizh.pageWeb.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

    HomePage homePage;
    ProductPage productPage;

    public HomePageStepDef(){
        homePage = new HomePage();
        productPage = new ProductPage();
    }

    @Given("pengguna berada pada tampilan utama")
    public void TampilanUtama() {
        homePage.GotoHomepage();
    }

    @Then("pengguna memilih produk {string}")
    public void PemilihanProduk(String produk) {
        productPage.klikproduct(produk);
    }

    @When("pengguna menekan tombol cart")
    public void MenekanTombolCart() {
        homePage.kliklabelcart();
    }

    @Then("pengguna memilih kategory laptop")
    public void CategoryLaptop() {
        homePage.klikKategori("Laptops");
    }

    @Then("pengguna menekan tombol home")
    public void TombolHome() {
        homePage.kliklabelhome();
    }

    @Then("pengguna memilih kategory monitor")
    public void CategoryMonitor() {
        homePage.klikKategori("Monitors");
    }

    @Then("pengguna masuk ke halaman utama")
    public void TampilanUtamaSetelahLogin() {
        homePage.validasihomepage();
    }

    @And("pengguna menekan label signup")
    public void penggunaMenekanLabelSignup() {
        homePage.kliklabelsignup();
    }

    @Then("pengguna memilih kategory phone")
    public void penggunaMemilihKategoryPhone() {
        homePage.klikKategori("Phones");
    }
}
