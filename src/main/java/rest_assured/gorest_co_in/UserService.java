package rest_assured.gorest_co_in;

import io.restassured.http.ContentType;
import rest_assured.gorest_co_in.dto.User;

import java.util.*;

import static io.restassured.RestAssured.given;
import static utils.EmailGeneration.generateRandomEmail;


public class UserService extends BaseRestService {

    //Post
    public static User createUser() {

        Map<String, Object> body = new HashMap<>();
        body.put("name", "Bob");
        body.put("gender", "male");
        body.put("email", generateRandomEmail());
        body.put("status", "active");

        return given()
                .spec(requestSpecification)
                .basePath("/v2/users")
                .contentType(ContentType.JSON)
                .when()
                .body(body)
                .post()
                .then()
                .assertThat()
                .statusCode(201)
                .extract()
                .as(User.class);
    }

    //Put
    public static User updateUser(User user) {
        user.setName("Alice");

        return given()
                .spec(requestSpecification)
                .basePath("/v2/users/" + user.getId())
                .contentType(ContentType.JSON)
                .when()
                .body(user)
                .put()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(User.class);
    }

    //Delete
    public static void deleteUser(User user) {
        given()
                .spec(requestSpecification)
                .basePath("/v2/users/" + user.getId())
                .when()
                .delete()
                .then()
                .assertThat()
                .statusLine("HTTP/1.1 204 No Content");
    }

    //Get
    public static List<User> getUsers() {
        return Arrays.asList(given()
                .spec(requestSpecification)
                .header("X-Pagination-Limit", "40")
                .basePath("/v2/users")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(User[].class));
    }

    public static boolean isUserExists(long userId) {
        try {
            getUsers()
                    .stream()
                    .filter(user -> user.getId().equals(userId))
                    .findAny()
                    .orElseThrow(() -> new NoSuchElementException(String.format("User doesn't exist: %d", userId)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
