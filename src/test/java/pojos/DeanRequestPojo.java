package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeanRequestPojo {
    private String birthDay;
    private String birthPlace;
    private String gender;
    private String name;
    private String password;
    private String phoneNumber;
    private String ssn;
    private String surname;
    private String username;
    private String userId;

    public DeanRequestPojo() {
    }

    public DeanRequestPojo(String birthDay, String birthPlace, String gender, String name, String password, String phoneNumber, String ssn, String surname, String username, String userId) {
        this.birthDay = birthDay;
        this.birthPlace = birthPlace;
        this.gender = gender;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.surname = surname;
        this.username = username;
        this.userId = userId;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "DeanRequestPojo{" +
                "birthDay='" + birthDay + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ssn='" + ssn + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}



