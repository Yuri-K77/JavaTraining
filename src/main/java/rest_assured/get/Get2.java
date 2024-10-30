/*package rest_assured.get;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class Get2 {

    @Test
    public void getList() {
        given()
                .baseUri("https://reqres.in/api/users?page=2")
                .contentType(ContentType.JSON)
                .log().body()
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .asString();

    }

}*/
