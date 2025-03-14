package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected final String BASE_URL = "https://petstore.swagger.io/v2";

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BASE_URL;
    }
}
