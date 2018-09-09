package framework.features.booking;

import framework.features.BaseTest;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
@Story("Booking")
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
  @Test
  public void filterByFirstName() {
    given().spec(reqSpec)
            .queryParam("firstname", "sally")
            .queryParam("lastname", "brown")
            .when().log().all()
            .get("booking")
            .then().log().all()
            .statusCode(200)
            .time(lessThan(20000L));
  }

  @Test
  public void filterByCheckInDate() {
    given().spec(reqSpec)
            .queryParam("checkin", "2014-03-13")
            .queryParam("checkout", "2014-05-21")
            .when()
            .get("booking")
            .then().log().all()
            .statusCode(200)
            .time(lessThan(20000L));
  }
}
