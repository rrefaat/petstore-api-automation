package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class UserAPI {

    private final String USER_ENDPOINT = "/user";

    public Response createUser(String userJson) {
        return given()
                .contentType(ContentType.JSON)
                .body(userJson)
                .when()
                .post(USER_ENDPOINT);
    }

    public Response getUserByUsername(String username) {
        return given()
                .when()
                .get(USER_ENDPOINT + "/" + username);
    }
}
