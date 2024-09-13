package com.muhfizh.StepDefWeb;

import com.muhfizh.pageWeb.ProductPage;
import io.cucumber.java.en.Then;

public class ProdukStepDef {

    ProductPage productPage;

    public ProdukStepDef(){
        this.productPage = new ProductPage();
    }

    @Then("pengguna menekan tombol add to cart")
    public void MenekanTombolAddToCart() {
        productPage.klikaddtocart();
    }

}
