package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: deepthia
 * Date: 7/11/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest {
    Library library=new Library();
    @Test
    public void testReserveNotValidID() {
        //Library library=new Library();
        assertEquals(1, library.reserve(99));
    }
    @Test
    public void testReserveValidID() {
        //Library library=new Library();
        assertEquals(2, library.reserve(1));
    }
    @Test
    public void testReserveNotAvailable() {
        //Library library=new Library();
        assertEquals(3, library.reserve(1));
    }
}
