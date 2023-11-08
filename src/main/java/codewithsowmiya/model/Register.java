package codewithsowmiya.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Register {
    @NotNull(message = "is required")
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;
    private String Address;
    @NotNull(message = "gender is required")
    private String gender;
    @NotNull(message = "state is required")
    private String State;
    @NotNull(message = "city is required")
    private String City;
    @NotNull(message = "email is required")
    @Email(message = "invalid email address")
    private String emailId;
    @NotNull(message = "password is required")
    @Size(min = 8, message = "password must be 8 characters")
    private String Password;
    @NotNull(message= "please enter a date formate")
    private Date dob;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
