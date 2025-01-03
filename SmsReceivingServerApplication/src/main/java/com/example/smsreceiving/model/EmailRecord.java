//package com.example.smsreceiving.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "message")
//public class EmailRecord {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String email;
//    private String message;
//    private String status; // PENDING, SENT, ERROR
//    private String mobile;
//
//    // Getters and Setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getMobileNumber() {
//        return mobile;
//    }
//
//    public void setMobileNumber(String mobile) {
//        this.mobile = mobile;
//    }
//}

package com.example.smsreceiving.model;

import jakarta.persistence.*;

@Entity
@Table(name = "message")
public class EmailRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String referenceNumber; // New field for reference number
    private String applicationType; // New field for application type
    private String message;
    private String status; // PENDING, SENT, ERROR
    private String mobile; // Field for mobile number

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobileNumber() {
        return mobile;
    }

    public void setMobileNumber(String mobile) {
        this.mobile = mobile;
    }
}
