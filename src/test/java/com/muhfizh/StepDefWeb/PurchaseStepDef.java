package com.muhfizh.StepDefWeb;

import com.muhfizh.Runner.BaseRun;
import com.muhfizh.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.muhfizh.page.CartPage;
import com.muhfizh.page.PurchasePage;

public class PurchaseStepDef {

    CartPage cartPage;
    PurchasePage purchasePage;
    HomePage homePage;

    public PurchaseStepDef(){
        this.homePage = new HomePage();
        this.cartPage = new CartPage();
        this.purchasePage = new PurchasePage();
    }

    @Then("pengguna menekan tombol place order")
    public void TombolPlaceOrder() {
        cartPage.placeorder();
    }

    @And("pengguna mengisi nama {string}")
    public void InputName(String Nama) {
        purchasePage.InputName(Nama);
    }

    @And("pengguna mengisi negara {string}")
    public void InputNegara(String Negara) {
        purchasePage.InputCountry(Negara);
    }

    @And("pengguna mengisi kota {string}")
    public void InputKota(String Kota) {
        purchasePage.InputCity(Kota);
    }

    @And("pengguna mengisi kartu kredit {string}")
    public void InputKartu(String Kartu) {
        purchasePage.InputCard(Kartu);
    }

    @And("pengguna mengisi bulan {string}")
    public void InputBulan(String bulan) {
        purchasePage.InputMonth(bulan);
    }

    @And("pengguna mengisi tahun {string}")
    public void InputTahun(String Tahun) {
        purchasePage.InputYear(Tahun);
    }

    @Then("pengguna menekan tombol purchase")
    public void TombolPurchase() {
        purchasePage.klikPurchase();
    }

    @Then("pengguna mendapatkan pesan {string}")
    public void penggunaMendapatkanPesan(String pesan) {
        homePage.ValidasiPesan(pesan);
    }

    @Then("pengguna mendapatkan info {string}")
    public void penggunaMendapatkanInfo(String pesan) {
        homePage.ValidasiPesan(pesan);
    }
}
