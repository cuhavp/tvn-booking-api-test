package framework.features.booking;

import framework.features.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class GetBookingIdsTest extends BaseTest {
  @Test
  public void getListBooking() {
    given().spec(reqSpec)
            .when()
            .get("booking")
            .then().log().all()
            .statusCode(200)
            .time(lessThan(20000L));
  }

  //TODO : filter by fistname/lastname
  //TODO : filter by checkin/checkout date
}
