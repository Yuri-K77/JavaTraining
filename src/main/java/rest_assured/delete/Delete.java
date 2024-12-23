package rest_assured.delete;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Delete {

    public void delete() {
        int empid = 15410;
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        // Delete the request and check the response
        Response response = request.delete("/delete/" + empid);
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);
        String jsonString = response.asString();
        Assert.assertTrue(jsonString.contains("successfully! deleted Records"));
        Assert.assertEquals(statusCode, 404);
        jsonString = response.asString();
        Assert.assertEquals(jsonString.contains("Record to delete not found"), true);
    }
}