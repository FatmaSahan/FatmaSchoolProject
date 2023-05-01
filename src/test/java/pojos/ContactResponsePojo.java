package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactResponsePojo {

    private ContactRequestPojo object;
    private  String message;
    private  String httpStatus;

    public ContactResponsePojo() {
    }

    public ContactResponsePojo(ContactRequestPojo object, String message, String httpStatus) {
        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public ContactRequestPojo getObject() {
        return object;
    }

    public void setObject(ContactRequestPojo object) {
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
        return "ContactResponsePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
