package com.twu.biblioteca;


import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    @Test
    public void getavailabletestfornormalbook() {
        Book b=new Book("test book",5);
        Assert.assertEquals(5,b.getAvailable());
    }
    @Test
    public void checkavailabletestfornormalbook() {
        Book b=new Book("test book",5);
        Assert.assertEquals(5,b.check_availability());
    }
    @Test
    public void gettotaltestfornormalbook()
    {
        Book b=new Book("test book",5);
        Assert.assertEquals(5,b.getTotal());
    }
    @Test
    public void getnametestfornormalbook()
    {
        Book b=new Book("test book",5);
        Assert.assertEquals("test book",b.getName());
    }
    @Test
    public void checkavailabletestforreservedbook()
    {
        Book b=new Book("test book",5);
        b.reserve();
        Assert.assertEquals(4,b.check_availability());
    }
    @Test
    public void gettotaltestforreservedbook()
    {
        Book b=new Book("test book",5);
        b.reserve();
        Assert.assertEquals(5,b.getTotal());
    }
    @Test
    public void checkavailabletestfornonavailablebook()
    {
        Book b=new Book("test book",5);
        b.setAvailable(0);
        Assert.assertEquals(-1,b.check_availability());
    }
    @Test
    public void getavailabletestfornonavailablebook()
    {
        Book b=new Book("test book",5);
        b.setAvailable(0);
        Assert.assertEquals(0,b.check_availability());
    }

}
