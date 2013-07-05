package com.twu.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class MovieTest {
    @Test
    public void getNameTest()
    {
        Movie m=new Movie("Movie",2001,"Test director",6);
        Assert.assertEquals("Movie",m.getName());
    }

    @Test
    public void getDirecterTest()
    {
        Movie m=new Movie("Movie",2001,"Test director",6);
        Assert.assertEquals("Test director",m.getDirector());
    }

    @Test
    public void getYearTest()
    {
        Movie m=new Movie("Movie",2001,"Test director",6);
        Assert.assertEquals(2001,m.getYear());
    }

    @Test
    public void getRatingTestIfRatingAvailable()
    {
        Movie m=new Movie("Movie",2001,"Test director",6);
        Assert.assertEquals(6,m.getRating());
    }
    @Test
    public void getRatingTestIfRatingNotAvailable()
    {
        Movie m=new Movie("Movie",2001,"Test director",-1);
        Assert.assertEquals(-1,m.getRating());
    }
}
