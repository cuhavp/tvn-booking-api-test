package framework.features.auth;

import com.google.gson.JsonObject;
import framework.features.BaseTest;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;
@Story("Auth")
public class CreateTokenTest extends BaseTest {
  @Test
  public void login() {
    JsonObject loginCredentials = new JsonObject();
    loginCredentials.addProperty("username", "admin");
    loginCredentials.addProperty("password", "password123");
    given().spec(reqSpec)
            .contentType("application/json")
            .when()
            .body(loginCredentials.toString())
            .post("auth")
            .then().log().all()
            .statusCode(200)
            .assertThat().body("token", is(String.class));
  }
}
