package rest_assured.gorest_co_in;

import io.restassured.http.ContentType;
import rest_assured.gorest_co_in.dto.Comment;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static io.restassured.RestAssured.given;
import static utils.EmailGeneration.generateRandomEmail;

public class CommentService extends BaseRestService {

    public static Comment createComment(int postId) {
        Comment comment = new Comment();
        comment.setEmail(generateRandomEmail());
        comment.setName("Comment #");
        comment.setBody("My incredible comment");

        return given()
                .spec(requestSpecification)
                .basePath("v2/posts/" + postId + "/comments")
                .contentType(ContentType.JSON)
                .body(comment)
                .post()
                .then()
                .assertThat()
                .statusCode(201)
                .extract().as(Comment.class);
    }

    public static List<Comment> getAllComments() {
        return Arrays.asList(
                given()
                        .spec(requestSpecification)
                        .basePath("v2/comments")
                        .get()
                        .then()
                        .assertThat()
                        .statusCode(200)
                        .extract().body().as(Comment[].class)
        );
    }

    public static List<Comment> retrievePostComments(int postId) {
        return Arrays.asList(
                given()
                        .spec(requestSpecification)
                        .basePath("v2/posts/" + postId + "/comments")
                        .get()
                        .then()
                        .assertThat()
                        .statusCode(200)
                        .extract().body().as(Comment[].class)
        );
    }

    public static boolean isCommentExist(int postId, int commentId) {
        try {
            retrievePostComments(postId)
                    .stream()
                    .filter(comment -> comment.getId().equals(commentId))
                    .findAny()
                    .orElseThrow(() -> new NoSuchElementException(String.format("Comment doesn't exist: %d", commentId)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void editComment(int commentId) {
        Comment editedBody = new Comment();
        editedBody.setEmail("1234@abcd.com");
        editedBody.setName("Comment name was changed.");
        editedBody.setBody("New text should be here.");

        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .basePath("/v2/comments/" + commentId)
                .body(editedBody)
                .patch()
                .then()
                .assertThat()
                .statusCode(200);
    }

    public static void deleteComment(int commentId) {
        given()
                .spec(requestSpecification)
                .basePath("/v2/comments/" + commentId)
                .delete()
                .then()
                .assertThat()
                .statusCode(204);
    }
}