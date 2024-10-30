/*package rest_assured.get;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Get1 {

    @Test
    public void getUrl(){
        String getUrl = "https://swapi.dev/api/people/";
        String path = "/1/";
        int statusCode = 200;

        given()
                .baseUri(getUrl)
                .basePath(path)
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(statusCode)
                .body("birth_year", equalTo("19BBY"));
    }
}*/