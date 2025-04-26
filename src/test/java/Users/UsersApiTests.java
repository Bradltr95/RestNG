package Users;

import TestManager.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersApiTests extends BaseTest {
    @Test()
    public static void testUserExists() {
        Response response = RestAssured.given().when().get("/users/1");

        // Validate the response status code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
    }
}
