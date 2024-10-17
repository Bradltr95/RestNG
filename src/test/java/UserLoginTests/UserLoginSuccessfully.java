package UserLoginTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginSuccessfully {

    @Test
    public void testGetUsers() {
        // Set the base URI
        RestAssured.baseURI = "https://reqres.in/api";

        // Send a GET request to the users endpoint
        Response response = RestAssured
                .given()
                .when()
                .get("/users?page=2");

        // Validate the response status code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");

        // Validate the response body
        String responseBody = response.getBody().asString();
        Assert.assertTrue(responseBody.contains("page"), "Response body does not contain 'page'");
        Assert.assertTrue(responseBody.contains("data"), "Response body does not contain 'data'");

        // Assert specific user details, you can do that as well
        Assert.assertTrue(responseBody.contains("email"), "Response body does not contain 'email'");
    }
}
