package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactRequestPojo {
    private String name;
    private String email;
    private String subject;
    private String message;
    private String date;

    public ContactRequestPojo() {
    }



    public String getEmail() {
        return email;
    }

    public ContactRequestPojo(String name, String email, String subject, String message, String date) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContactRequestPojo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
