package api.stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;
import java.util.HashMap;
import static io.restassured.RestAssured.given;

public class CreateList extends TestBaseApi {

    Response response;
    JsonPath jsonPath;

    @Given("Send POST request for create {string} list")
    public void send_post_request_for_create_list(String listName) {

        setUp();
        spec.pathParams("first",1,"second","lists");

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",listName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));
        requestBody.put("idBoard", ConfigReader.getProperty("idBoard"));

        System.out.println(requestBody);

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                post("/{first}/{second}");

        response.prettyPrint();
        jsonPath=response.jsonPath();
    }

    @Then("Assert status code is {int}")
    public void assertStatusCodeIs(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());

    }

    @Then("Assert list name is {string}")
    public void assert_list_name_is(String listName) {

        Assert.assertEquals(listName,jsonPath.getString("name"));

    }


}
