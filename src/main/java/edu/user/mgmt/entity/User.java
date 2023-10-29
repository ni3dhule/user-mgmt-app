package edu.user.mgmt.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;
    private String userName;
    private String emailId;
    private String contactNo;
    private String aadhaarNo;
    private String panNo;
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aadhaarNo, emailId, panNo, userId, userName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        return Objects.equals(aadhaarNo, other.aadhaarNo) && Objects.equals(emailId, other.emailId)
                && Objects.equals(panNo, other.panNo) && userId == other.userId
                && Objects.equals(userName, other.userName);
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
                + ", userName=" + userName + ", gender=" + gender + ", emailId=" + emailId + ", contactNo=" + contactNo
                + ", aadhaarNo=" + aadhaarNo + ", panNo=" + panNo + "]";
    }
}
