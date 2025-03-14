package utils;

import io.restassured.response.Response;

public class LoggerUtil {
    public static void logResponse(Response response) {
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.prettyPrint());
    }
}
