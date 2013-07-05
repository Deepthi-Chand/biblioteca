package com.twu.biblioteca;


import junit.framework.Assert;
import org.junit.Test;


public class BookTest {
    @Test
    public void getAvailableTestForNormalBook() {
        Book b=new Book("test book");
        Assert.assertEquals(true,b.getAvailablity());
    }
    @Test
    public void getNameTestForNormalBook()
    {
        Book b=new Book("test book");
        Assert.assertEquals("test book",b.getName());
    }
    @Test
    public void checkAvailableTestForReservedBook()
    {
        Book b=new Book("test book");
        b.reserve();
        Assert.assertEquals(false,b.getAvailablity());
    }
}
