package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterResponsePojo {
    /*
    "object": {
        "userId": 116,
        "username": "T18Joan",
        "name": "Joan",
        "surname": "walker",
        "birthDay": null,
        "ssn": "111-23-4567",
        "birthPlace": null,
        "phoneNumber": "222-333-5550",
        "gender": "FEMALE"
    },
    "message": "Guest User registered.",
    "httpStatus": "CREATED"
}
     */
    private RegisterRequestPojo object;
    private String message;
    private String httpStatus;

    public RegisterResponsePojo() {
    }

    public RegisterResponsePojo(RegisterRequestPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public RegisterRequestPojo getObject() {
        return object;
    }

    public void setObject(RegisterRequestPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "RegisterResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
