package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationSchool.generateToken;

public class SchoolBaseUrl {

    public static RequestSpecification spec;

    public static void schoolSetUp() {

        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", generateToken()).
                setBaseUri("http://164.92.252.42:8080").build();

//https://school-management-v1.herokuapp.com/
    }
}
