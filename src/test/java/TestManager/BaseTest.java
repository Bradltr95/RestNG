package TestManager;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    @BeforeClass
    @Parameters("baseUrl")
    public void setUp(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        System.out.println("Base URL is set to: " + baseUrl);
    }
}
