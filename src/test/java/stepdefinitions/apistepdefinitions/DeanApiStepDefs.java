package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pojos.DeanRequestPojo;
import pojos.DeanResponsePojo;

import static base_urls.SchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class DeanApiStepDefs {


    Faker faker = new Faker();
    String phoneNumber;
    String name = faker.name().firstName();
    String birthPlace=faker.country().capital();
    String surName = faker.name().lastName();
    String username = faker.name().username();
    String ssn = faker.idNumber().ssnValid();
    public static String userId;


    @Given("user sends post request and create dean")
    public void user_sends_post_request_and_create_dean() {

        phoneNumber = String.valueOf(faker.number().randomNumber(10, true));
        phoneNumber=phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);

//{{baseUrl}}/dean/save


        spec.pathParams("first", "dean", "second", "save");

//set the expectedData

        DeanRequestPojo expectedData = new DeanRequestPojo("2010-11-11",birthPlace,"MALE",name,"987654321",phoneNumber,ssn,surName,username,null);
        System.out.println("expectedData = " + expectedData);

        Response response=given(spec).body(expectedData).post("{first}/{second}");//birkac parametre oldugunda "/" isareti koymamiz gerekiyor
        response.prettyPrint();

        DeanResponsePojo actualData = response.as(DeanResponsePojo.class);
        System.out.println("actualData = " + actualData);


//Do assertion
        assertEquals(200, response.statusCode());

        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());

        userId=actualData.getObject().getUserId();
        System.out.println("userId = " + userId);

    }

    @Given("user sends put request and update dean")
    public void userSendsPutRequestAndUpdateDean() {

        //{{baseUrl}}/dean/update/{{userId}}

        phoneNumber = String.valueOf(faker.number().randomNumber(10, true));
        phoneNumber=phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);

        spec.pathParams("first", "dean", "second", "update","third",userId);

//set the expectedData

        DeanRequestPojo expectedData = new DeanRequestPojo("2010-11-11",birthPlace,"MALE",name,"987654321",phoneNumber,ssn,surName,username,null);
        System.out.println("expectedData = " + expectedData);

        Response response=given(spec).body(expectedData).put("{first}/{second}/{third}");//birkac parametre oldugunda "/" isareti koymamiz gerekiyor
        response.prettyPrint();

        DeanResponsePojo actualData = response.as(DeanResponsePojo.class);
        System.out.println("actualData = " + actualData);

//Do assertion
        assertEquals(200, response.statusCode());

        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());

        userId=actualData.getObject().getUserId();
        System.out.println("userId = " + userId);



    }

    @Given("user sends delete request and delete dean")
    public void userSendsDeleteRequestAndDeleteDean() {
        //{{baseUrl}}/dean/delete/{{userId}}

        spec.pathParams("first", "dean", "second", "delete","third",userId);
        Response response=given(spec).delete("{first}/{second}/{third}");//birkac parametre oldugunda "/" isareti koymamiz gerekiyor
        response.prettyPrint();

        DeanResponsePojo actualData = response.as(DeanResponsePojo.class);
        System.out.println("actualData = " + actualData);

//Do assertion
        assertEquals(200, response.statusCode());

        assertEquals("Dean Deleted", actualData.getMessage());


    }
}
