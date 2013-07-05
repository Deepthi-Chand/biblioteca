package com.twu.biblioteca;

public class User {
    private String loginID;
    private String password;
    UserDetails details;
    User(String ID,String password,String phonenumber,String emailID,String name)
    {
        this.loginID=ID;
        this.password=password;
        details=new UserDetails(name,emailID,phonenumber);
    }
    public boolean check(String loginID, String password) {
        return (this.loginID.equals(loginID) && this.password.equals(password));
    }

    public String getName() {
        return details.getName();
    }

    public String getPhoneNumber() {
        return details.getPhonenumber();
    }

    public String getEmailID() {
        return details.getEmailID();
    }
}
