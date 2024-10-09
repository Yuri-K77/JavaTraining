package rest_assured.post;//package rest_assured.Post;
//
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import junit.framework.Assert;
//import io.restassured.RestAssured;
//import org.json.simple.JSONObject;
//import org.junit.Test;
//import java.util.Date;
//
//
//public class Post {
//
//    @Test
//    public void postRequestExampleTest() {
//        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("FirstName", someRandomString);
//        requestBody.put("LastName", someRandomString);
//        requestBody.put("UserName", someRandomString);
//        requestBody.put("Password", someRandomString);
//        requestBody.put("Email", someRandomString + "@gmail.com");
//        RequestSpecification request = RestAssured.given();
//        request.header("Content-Type", "application/json");
//        request.body(requestBody.toJSONString());
//        Response response = request.post("https://webhook.site/dea017e2-5fdf-44e3-bc89-6b6f32e24a5a");
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);
//        System.out.println("\n" + "The status code recieved: " + statusCode);
//    }
//}
