package framework.features;

import io.qameta.allure.Story;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Story("Ping")
public class BaseTest {
  protected RequestSpecification reqSpec;
  protected String token;

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
