package framework.features.booking;

import framework.data.Booking;
import framework.features.BaseTest;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

@Story("Booking")
public class GetBookingTest extends BaseTest {


  @Test(priority = 1)
  public void specificBooking() {
    given().spec(reqSpec)
            .when()
            .get("booking/1")
            .then().log().all()
            .statusCode(200)
            .time(lessThan(20000L));
  }

  @DataProvider
  public Object[][] bookingData() {
    return new Object[][]{
            new Object[]{"1"},
            new Object[]{"2"},
            new Object[]{"3"},
            new Object[]{"4"},
    };
  }

  @Test(dataProvider = "bookingData", priority = 2)
  public void specificBookingWithParam(String id) {
    given().spec(reqSpec).pathParam("bookingID", id)
            .when().log().all()
            .get("booking/{bookingID}")
            .then().log().all()
            .statusCode(200)
            .time(lessThan(20000L));
  }

  @Test(priority = 3)
  public void myBooking() {
    Booking myBooking = given().spec(reqSpec)
            .when()
            .get("booking/1")
            .as(Booking.class);
    Assert.assertEquals(myBooking.getFirstname(), "Mark");
    Assert.assertEquals(myBooking.getBookingdates().getCheckin(), "2017-06-03");
  }
}
