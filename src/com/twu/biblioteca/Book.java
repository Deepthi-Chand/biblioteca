package com.twu.biblioteca;

public class Book {
    private int total;
    private int available;
    private String name;
    public Book(String nam,int tot)
    {
        name=nam;
        total=tot;
        available=tot;
    }

    int check_availability()
    {
        if(available>0)
            return available;
        else
            return -1;
    }
    void reserve()
    {
        available--;
    }
    int getTotal()
    {
        return total;
    }
    int getAvailable()
    {
        return available;
    }
    String getName()
    {
        return name;
    }
    void setAvailable(int available1l)
    {
        available= available1l;
    }
}
