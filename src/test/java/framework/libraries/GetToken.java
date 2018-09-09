package framework.libraries;

import com.google.gson.JsonObject;

import static io.restassured.RestAssured.given;

public class GetToken {

  public static String get() {
    JsonObject loginCredentials = new JsonObject();
    loginCredentials.addProperty("username", "admin");
    loginCredentials.addProperty("password", "password123");
    return given().baseUri("https://restful-booker.herokuapp.com")
            .contentType("application/json")
            .when()
            .body(loginCredentials.toString())
            .post("auth")
            .body().path("token");
  }
}
