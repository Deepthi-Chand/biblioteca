package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
public class Library {
    List<Book> bookList = new ArrayList<Book>();
    List<Movie> movieList=new ArrayList<Movie>();
    Library()
    {
        bookList.add(new Book("FirstBook",2));
        bookList.add(new Book("Second Book",1));
        bookList.add(new Book("Third Book",3));
        bookList.add(new Book("Fourth Book",1));
        bookList.add(new Book("Fifth Book",4));
        movieList.add(new Movie("Movie 1",1991,"director 1",6));
        movieList.add(new Movie("Movie 2",1992,"director 2",5));
        movieList.add(new Movie("Movie 3",1993,"director 3",4));
        movieList.add(new Movie("Movie 4",1994,"director 4",7));
        movieList.add(new Movie("Movie 5",1995,"director 5",1));
        movieList.add(new Movie("Movie 6",1996,"director 6",9));
        movieList.add(new Movie("Movie 7",1997,"director 7",6));
        movieList.add(new Movie("Movie 8",1998,"director 8",8));
        movieList.add(new Movie("Movie 9",1999,"director 9",9));
        movieList.add(new Movie("Movie 10",2001,"director 10",-1));
        movieList.add(new Movie("Movie 11",2002,"director 11",9));
        movieList.add(new Movie("Movie 12",2003,"director 12",3));
        movieList.add(new Movie("Movie 13",2004,"director 13",-1));
        movieList.add(new Movie("Movie 14",2005,"director 14",5));
        movieList.add(new Movie("Movie 15",2006,"director 15",-1));
    }
    void welcome_message()
    {
        System.out.println("\t\tWelcome To Biblioteca");
        System.out.println("\t\t        MENU        \n");
    }
    void showBookList()
    {
        for (Book b: bookList)
        {
            System.out.println((bookList.indexOf(b)+1)+": "+b.getName());
            System.out.println("\t\t"+b.getAvailable()+" of "+b.getTotal()+" available");
        }
    }
    void reserve(int bookID)
    {
        if(bookID>4)
        {
            System.out.println("Wrong ID of Book");
            return;
        }
        Book t=bookList.get(bookID);
        if(t.check_availability()>0)
        {
            t.reserve();
            System.out.println("Book Successfully reserved");
        }
        else
        {
            System.out.println("Cannot reserve Book");
        }

    }

    public void showMovieList() {
        String rate;
        System.out.println("ID \t Movie  \t Year \t Director \t Rating");
        System.out.println("------------------------------------------");
        for(Movie m:movieList)
        {
            if(m.getRating()==-1)
                rate="N/A";
            else
                rate= String.valueOf(m.getRating());
            System.out.println((movieList.indexOf(m) + 1) + " \t" + m.getName() + " \t" + m.getYear() + " \t" + m.getDirector() + "  \t" + rate + " ");

        }
    }

    public void checkMembership(int userID) {
        if(userID==-1)
            System.out.println("Please talk to a Librarian. Thank you.");
        else {}

    }
}
