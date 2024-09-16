package com.muhfizh.pageApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {
    String urlBase1, urlBase2, userID;

    Response respon;

    public ApiPage(){

    }

    public static RequestSpecification request;

    public static void setHeader(){
        request = RestAssured.given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON);
    }

    public void Url1(){
        urlBase1 = "https://reqres.in/";
    }

    public void Url2(){
        urlBase2 = "https://gorest.co.in/public/v2/";
    }

    public void HitGet(){
        setHeader();
        respon = request.get(urlBase1 + "api/users?page=1");
    }

    public void HitPost(){
        String name = "Muhfizh";
        String job = "Student";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("job", job);
        setHeader();
        respon = request.log().all()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(jsonObject.toString())
                .post(urlBase1+"api/users");
    }

    public void HitPut(){
        int userId = 2;
        String newName = "Name Muhfizh";
        String fname = given().when().get(urlBase1+"api/users/"+userId).getBody().jsonPath().get("data.first_name");
        String lname = given().when().get(urlBase1+"api/users/"+userId).getBody().jsonPath().get("data.last_name");
        String avatar = given().when().get(urlBase1+"api/users/"+userId).getBody().jsonPath().get("data.avatar");
        String email = given().when().get(urlBase1+"api/users/"+userId).getBody().jsonPath().get("data.email");
        System.out.println("name before = "+fname);

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id", userId);
        bodyMap.put("email", email);
        bodyMap.put("first_name", newName);
        bodyMap.put("last_name", lname);
        bodyMap.put("avatar", avatar);
        JSONObject jsonObject = new JSONObject(bodyMap);

        setHeader();
        respon = request.log().all()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .put(urlBase1+"api/users/"+userId);

    }

    public void HitDelete(){
        int userToDelete = 4;
        setHeader();
        respon = request.log().all()
                .when().delete(urlBase1+"api/users/" +userToDelete);
    }

    public void HitGetInvalid(){
        setHeader();
        respon = request.when().get(urlBase2+"users");
    }

    public void HitPostInvalid(){
        String fname = "Muhfizh";
        String lname = "Dzakir";
        String email = "muhfizh@gmail.com";

        JSONObject payload = new JSONObject();
        payload.put("first_name", fname);
        payload.put("last_name", lname);
        payload.put("email", email);

        setHeader();
        respon = request.body(payload.toString()).when().post(urlBase2+"users");
    }

    public void ValidasiCode(int Code){
        assertThat(respon.statusCode()).isEqualTo(Code);
    }

    public void ValidasiBodyget(){
        List<Object> id = respon.jsonPath().getList("data.id");
        List<Object> fname = respon.jsonPath().getList("data.first_name");
        List<Object> lname = respon.jsonPath().getList("data.last_name");
        List<Object> email = respon.jsonPath().getList("data.email");

        assertThat(id.get(0)).isNotNull();
        assertThat(fname.get(0)).isNotNull();
        assertThat(lname.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();

        userID = id.get(0).toString();
    }

    public void ValidasiJsonSChema(String file){
        File JSONfile = new File("src/test/java/com/muhfizh/Json/" + file);
        respon.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONfile));
    }

    public void ValidasiBodypost(){
        JsonPath jsonPathEvaluator = respon.jsonPath();
        String name = jsonPathEvaluator.get("name");
        String job = jsonPathEvaluator.get("job");
        String createdAt = jsonPathEvaluator.get("createdAt").toString();
        String id = jsonPathEvaluator.get("id").toString();

        assertThat(name).isNotNull();
        assertThat(job).isNotNull();
        assertThat(createdAt).isNotNull();
        assertThat(id).isNotNull();

        userID = id;
    }

    public void ValidasiBodyput(){
        JsonPath jsonPathEvaluator = respon.jsonPath();
        String email = jsonPathEvaluator.get("email");
        String first_name = jsonPathEvaluator.get("first_name");
        String last_name = jsonPathEvaluator.get("last_name");

        assertThat(email).isNotNull();
        assertThat(first_name).isNotNull();
        assertThat(last_name).isNotNull();
    }


}
