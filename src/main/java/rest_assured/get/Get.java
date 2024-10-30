/*package rest_assured.get;

import io.restassured.RestAssured;
import junit.Test;

import static org.hamcrest.Matchers.is;


public class Get {

    @Test
    public void postmanFirstGetTest(){
        RestAssured.
                when()
                .get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").
                then()
                .assertThat()
                .statusCode(200).
                and()
                .body("args.foo2", is("bar2"));
    }
}*/