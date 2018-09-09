package framework.features.booking;

import framework.data.Booking;
import framework.data.BookingDate;
import framework.features.BaseTest;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
@Story("Booking")
public class UpdateBookingTest extends BaseTest {

  @Test
  public void updateMyBooking() {
    BookingDate bookingDate = new BookingDate("2018-01-01", "2019-01-01");
    Booking booking = new Booking("Jim", "Brown", 111, true, bookingDate, "Breakfast");
    given().spec(reqSpec)
            .when()
            .body(booking)
            .put("booking/1")
            .then()
            .statusCode(200);
  }

}
