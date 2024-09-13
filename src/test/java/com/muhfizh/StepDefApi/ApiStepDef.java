package com.muhfizh.StepDefApi;

import com.muhfizh.pageApi.ApiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiStepDef {

    ApiPage apiPage;

    @Given("Mempersiapkan Url Get user")
    public void mempersiapkanUrlGetUser() {
        apiPage.Url1();
    }

    @And("hit API dengan Get")
    public void hitAPIDenganGet() {
        apiPage.HitGet();
    }

    @Then("verifikasi kode status {int}")
    public void verifikasiKodeStatus(int code) {
        apiPage.ValidasiCode(code);
    }

    @Then("verifikasi respon body get data")
    public void verifikasiResponBodyGetData() {
        apiPage.ValidasiBodyget();
    }

    @Then("verifikasi respon json dengan JSON Schema {string}")
    public void verifikasiResponJsonDenganJSONSchema(String file) {
        apiPage.ValidasiJsonSChema(file);
    }

    @Given("Mempersiapkan Url post new user")
    public void mempersiapkanUrlPostNewUser() {
        apiPage.Url1();
    }

    @And("hit API dengan POST")
    public void hitAPIDenganPOST() {
        apiPage.HitPost();
    }

    @Then("verifikasi respon body post data")
    public void verifikasiResponBodyPostData() {
        apiPage.ValidasiBodypost();
    }

    @Given("Mempersiapkan Url put update user")
    public void mempersiapkanUrlPutUpdateUser() {
        apiPage.Url1();
    }

    @And("hit API dengan PUT")
    public void hitAPIDenganPUT() {
        apiPage.HitPut();
    }

    @Then("verifikasi respon body put data")
    public void verifikasiResponBodyPutData() {
        apiPage.ValidasiBodyput();
    }

    @Given("Mempersiapkan Url delete user")
    public void mempersiapkanUrlDeleteUser() {
        apiPage.Url1();
    }

    @And("hit API dengan DELETE")
    public void hitAPIDenganDELETE() {
        apiPage.HitDelete();
    }

    @Given("Mempersiapkan Url get authentifikasi gagal")
    public void mempersiapkanUrlGetAuthentifikasiGagal() {
        apiPage.Url2();
    }

    @And("hit API dengan get kondisi authentifikasi gagal")
    public void hitAPIDenganGetKondisiAuthentifikasiGagal() {
        apiPage.HitGetInvalid();
    }

    @Given("Mempersiapkan Url create data authentifikasi gagal")
    public void mempersiapkanUrlCreateDataAuthentifikasiGagal() {
        apiPage.Url2();
    }

    @And("hit API dengan POST dengan authentifikasi gagal")
    public void hitAPIDenganPOSTDenganAuthentifikasiGagal() {
        apiPage.HitPostInvalid();
    }
}
