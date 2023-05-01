package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.RegisterRequestPojo;
import pojos.RegisterResponsePojo;

import static base_urls.SchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class apiStepdefsFatma extends RegisterContactStepDefs{
    Response response;
    /*

    "content": [
        {
            "id": 1,
            "username": "Rico27",
            "ssn": "159-31-4394",
            "name": "Judy",
            "surname": "Harvey",
            "birthDay": "2001-01-01",
            "birthPlace": "Israel",
            "phoneNumber": "645-969-9245",
            "gender": "MALE"
        },
     */

    @Given("searchs created guest user")
    public void searchs_created_guest_user() {
        //http://164.92.252.42:8080/guestUser/getAll?size=10000&sort=id
 //           set the url
        spec.pathParams("first","guestUser","second","getAll").
                queryParams("size","10000");

        response=  given(spec).get("{first}/{second}");//tum responslar list halinde gelir//grovy language ile dogrulayabiiriz
         response.prettyPrint();

 //         Create expected Data
        String genderFS="FEMALE";
        RegisterRequestPojo expectedData=new RegisterRequestPojo(fakerUserNameFS,fakerSsnFS,fakerNameFS,fakerSurnameFS,
                                                                 fakerBirthDayFS,fakerBirtPlaceFS, fakerPhoneNumberFS,genderFS);



    }


    @Then("makes validation")
    public void makes_validation() {
        JsonPath jsonPath=response.jsonPath();
        String actUserName= jsonPath.getList("content.findAll{it.ssn=='fakerSsnFS'}.username").get(0).toString();

    }
}
