package framework.features;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
  protected RequestSpecification reqSpec;
  protected String accessToken;

  @BeforeTest
  public void setup() {
    reqSpec = new RequestSpecBuilder()
            .setBaseUri("https://restful-booker.herokuapp.com")
            .build();
  }

  @AfterTest
  public void tearDown() {

  }
}
