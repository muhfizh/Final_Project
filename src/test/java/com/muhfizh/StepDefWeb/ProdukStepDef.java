package com.muhfizh.StepDefWeb;

import com.muhfizh.page.ProductPage;
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
