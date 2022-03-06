package api.stepdefinitions;

import api.trellopojos.CreateListPojo;
import api.trellopojos.RequestForList;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import ui.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class CreateListWithPojo extends TestBaseApi {

    Response response;
    CreateListPojo resPojo;

    @Given("POST request for create list {string} with pojo")
    public void postRequestForCreateListWithPojo(String listName) {

        RequestForList req = new RequestForList(ConfigReader.getProperty("key"), ConfigReader.getProperty("token"),listName,ConfigReader.getProperty("idBoard"));

        setUp();
        spec.pathParams("first" , 1 , "second" , "lists");

       response = given().contentType("application/json")
                .spec(spec)
                .body(req)
                .when()
                .post("/{first}/{second}");

       response.prettyPrint();
    }

    @Then("get list response with pojo")
    public void getListResponseWithPojo() {

        resPojo=response.as(api.trellopojos.CreateListPojo.class);
        System.out.println(resPojo);
    }

    @And("assert list response {string}")
    public void assertListResponse(String listName) {

        assertEquals(200,response.getStatusCode());
        assertEquals(listName,resPojo.getName());

    }

}
