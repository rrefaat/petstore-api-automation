package tests;

import api.PetAPI;
import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.LoggerUtil;

public class PetStoreTests extends BaseTest {

    private PetAPI petAPI = new PetAPI();

    @Test
    public void testGetRandomPet() {
        int petId = 1; // Example pet ID, ideally fetched dynamically
        Response response = petAPI.getPetById(petId);
        
        LoggerUtil.logResponse(response);
        Assert.assertEquals(response.getStatusCode(), 200, "Failed to fetch pet!");
        
        String petName = response.jsonPath().getString("name");
        System.out.println("Pet Name: " + petName);
        Assert.assertNotNull(petName, "Pet name should not be null");
    }

    @Test
    public void testGetPetsByStatus() {
        String status = "available";
        Response response = petAPI.findPetsByStatus(status);
        
        LoggerUtil.logResponse(response);
        Assert.assertEquals(response.getStatusCode(), 200, "Failed to fetch pets!");
        
        Assert.assertTrue(response.jsonPath().getList("name").size() > 0, "Should return at least one pet");
    }

    @Test
    public void testCreateNewPet() {
        String petJson = "{ \"id\": 9999, \"name\": \"TestPet\", \"status\": \"available\" }";
        
        Response response = petAPI.createPet(petJson);
        LoggerUtil.logResponse(response);
        Assert.assertEquals(response.getStatusCode(), 200, "Pet creation failed!");
    }
}
