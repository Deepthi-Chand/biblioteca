package com.twu.biblioteca;

public class UserDetails {
    private String name;
    private String emailID;
    private String phonenumber;
    UserDetails(String name,String emailID,String phonenumber)
    {
        this.emailID=emailID;
        this.name=name;
        this.phonenumber=phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
