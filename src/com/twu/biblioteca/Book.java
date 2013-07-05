package com.twu.biblioteca;

public class Book {
    private boolean available;
    private String name;
    public Book(String nam)
    {
        name=nam;
        available=true;
    }
    void reserve()
    {
        available=false;
    }
    boolean getAvailablity()
    {
        return available;
    }
    String getName()
    {
        return name;
    }
    void setAvailable()       //future enhancement
    {
        available= true;
    }
}
