package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PetAPI {
    
    private final String PET_ENDPOINT = "/pet";

    public Response getPetById(int petId) {
        return given()
                .when()
                .get(PET_ENDPOINT + "/" + petId);
    }

    public Response findPetsByStatus(String status) {
        return given()
                .queryParam("status", status)
                .when()
                .get(PET_ENDPOINT + "/findByStatus");
    }

    public Response createPet(String petJson) {
        return given()
                .contentType(ContentType.JSON)
                .body(petJson)
                .when()
                .post(PET_ENDPOINT);
    }
}
