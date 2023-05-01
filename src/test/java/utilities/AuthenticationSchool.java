package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationSchool {

    public static String generateToken(){

        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("password","987654321");
        bodyMap.put("username","T18Admin");

        Response response = given().contentType(ContentType.JSON).body(bodyMap).post("http://164.92.252.42:8080/auth/login");
        return  response.jsonPath().getString("token");

    }


}
