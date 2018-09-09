package framework.features.ping;

import framework.features.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HeathCheckingTest extends BaseTest {

  @Test
  public void checking() {
    given().spec(reqSpec)
            .when()
            .get("ping")
            .then().log().all()
            .statusCode(201);
  }
}
