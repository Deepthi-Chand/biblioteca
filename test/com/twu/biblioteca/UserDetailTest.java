package com.twu.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserDetailTest {
    @Test
     public void getNameTest()
    {
        UserDetails details=new UserDetails("test name","Test mail ID","9999999999");
        Assert.assertEquals("test name",details.getName());
    }

    @Test
    public void getEmailIDTest()
    {
        UserDetails details=new UserDetails("test name","Test mail ID","9999999999");
        Assert.assertEquals("Test mail ID",details.getEmailID());
    }

    @Test
    public void getPhoneNumberTest()
    {
        UserDetails details=new UserDetails("test name","Test mail ID","9999999999");
        Assert.assertEquals("9999999999",details.getPhonenumber());
    }
}
