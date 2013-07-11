package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
public class Library {
    List<Book> bookList = new ArrayList<Book>();
    List<Movie> movieList=new ArrayList<Movie>();
    List<User> userList=new ArrayList<User>();
    private String book;
    static int index=-1;
    private String movieDetails;

    Library()
    {
        bookList.add(new Book("FirstBook"));
        bookList.add(new Book("Second Book"));
        bookList.add(new Book("Third Book"));
        movieList.add(new Movie("Movie 1",1991,"director 1",6));
        movieList.add(new Movie("Movie 2",1992,"director 2",5));
        movieList.add(new Movie("Movie 3",1993,"director 3",4));
        /*movieList.add(new Movie("Movie 4",1994,"director 4",7));
        movieList.add(new Movie("Movie 5",1995,"director 5",1));
        movieList.add(new Movie("Movie 6",1996,"director 6",9));
        movieList.add(new Movie("Movie 7",1997,"director 7",6));
        movieList.add(new Movie("Movie 8",1998,"director 8",8));
        movieList.add(new Movie("Movie 9",1999,"director 9",9));*/
        movieList.add(new Movie("Movie 10",2001,"director 10",-1));
        //movieList.add(new Movie("Movie 11",2002,"director 11",9));
        //movieList.add(new Movie("Movie 12",2003,"director 12",3));
        movieList.add(new Movie("Movie 13",2004,"director 13",-1));
        //movieList.add(new Movie("Movie 14",2005,"director 14",5));
        movieList.add(new Movie("Movie 15",2006,"director 15",-1));
        userList.add(new User("111-1111","1234","9849849849","user1@domain.com","user1"));
        userList.add(new User("222-2222","12345","9898989898","user2@domain.com","user2"));
    }
    int reserve(int bookID)
    {
        if(bookID>bookList.size()-1||bookID<0)
            return 1;
        Book t=bookList.get(bookID);
        if(t.getAvailablity())
        {
            t.reserve();
            return 2;
        }
        else
            return 3;
    }

    public String checkMembership(int userID) {
        String membership_detail="";
        if(userID==-1)
            membership_detail="Please talk to a Librarian. Thank you.";
        else
        {
            User u=userList.get(userID);
            membership_detail+="Name:\t"+u.getName()+"\n";
            membership_detail+="Phonenumber:\t" + u.getPhoneNumber()+"\n";
            membership_detail+="EmaitID:\t" + u.getEmailID()+"\n";

        }
        return membership_detail;

    }

    public int login(String loginID, String password) {
        int userID=-2;
        for(User u:userList)
            if(u.check(loginID,password))
            {
                userID= userList.indexOf(u);
                System.out.print("\tYES");
                break;
            }
        return userID;
    }

    public String getBookDetails() {
        String printString="";
        Book b;
        index++;
        if(index==bookList.size())
            index=-1;
        else
        {
            b=bookList.get(index);
            printString= (bookList.indexOf(b)+1)+": "+b.getName()+"\n"+"\t\tAvailable:\t"+b.getAvailablity()+"\n";
        }
        return printString;
    }

    public String getMovieDetails() {
        String movieDetails = "";
        String rate;
        Movie m;
        index++;
        if(index==movieList.size())
            index=-1;
        else
        {
            m=movieList.get(index);
            if(m.getRating()==-1)
                rate="N/A";
            else
                rate= String.valueOf(m.getRating());
            movieDetails=(movieList.indexOf(m) + 1) + " \t" + m.getName() + " \t" + m.getYear() + " \t" + m.getDirector() + "  \t" + rate + " "+"\n";
        }
        return movieDetails;
    }
}
