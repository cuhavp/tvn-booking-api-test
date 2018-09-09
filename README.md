# tvn-booking-api-test
using for rest-api testing training course
https://restful-booker.herokuapp.com/apidoc/index.html
create by: HaDo(ha.dothanh2011@gmail.com)

&copy;https://testingvn.com
## how to run
```cmd
mvn clean test allure:report
```
## getting report
target/site/allure-maven-plugin/index.html
```text
├── pom.xml
├── scripts
│   └── booking.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    │       └── allure.properties
    └── test
        ├── java
        │   └── framework
        │       ├── configuration
        │       ├── data
        │       │   ├── Booking.java
        │       │   └── BookingDate.java
        │       ├── features
        │       │   ├── BaseTest.java
        │       │   ├── auth
        │       │   │   └── CreateTokenTest.java
        │       │   ├── booking
        │       │   │   ├── CreateBookingTest.java
        │       │   │   ├── DeleteBookingTesting.java
        │       │   │   ├── GetBookingIdsTest.java
        │       │   │   ├── GetBookingTest.java
        │       │   │   ├── PartialUpdateBookingTest.java
        │       │   │   └── UpdateBookingTest.java
        │       │   └── ping
        │       │       └── HeathCheckingTest.java
        │       ├── libraries
        │       └── supports
```
