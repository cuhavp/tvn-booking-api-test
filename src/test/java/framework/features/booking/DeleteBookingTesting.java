package framework.features.booking;

import framework.features.BaseTest;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Story("Booking")
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
