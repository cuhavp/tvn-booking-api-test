package framework.features.booking;

import framework.features.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class DeleteBookingTesting extends BaseTest {

  @Test
  public void deleteMyBooking() {
    given().spec(reqSpec)
            .when()
            .delete("booking/1")
            .then()
            .statusCode(200);
  }
}
