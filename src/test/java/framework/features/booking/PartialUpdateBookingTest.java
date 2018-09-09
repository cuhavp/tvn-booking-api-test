package framework.features.booking;

import com.google.gson.JsonObject;
import framework.features.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PartialUpdateBookingTest extends BaseTest {

  @Test
  public void updateMyBookingDate() {
    JsonObject updatePartialBook = new JsonObject();

    updatePartialBook.addProperty("firstname", "James");
    updatePartialBook.addProperty("lastname", "Brown");

    given().spec(reqSpec)
            .when()
            .body(updatePartialBook)
            .patch("booking/1")
            .then()
            .statusCode(200);
  }
}
