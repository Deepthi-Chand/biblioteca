package com.twu.biblioteca;
import java.io.IOException;
import java.util.Scanner;
//import static java.lang.System.exit;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library libraryHead =new Library();
        Scanner sc = new Scanner(System.in);
        int flag=-1;
        int userID=-1;          //-1 if user not logged in
        while(flag!=0)
        {
            System.out.println("");
            libraryHead.welcome_message();
            displayOptions(userID);
            flag=sc.nextInt();
            switch(flag)
            {
                case 1:
                    break;
                case 2:
                    libraryHead.showBookList();
                    System.out.print("Press enter to continue");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    libraryHead.showMovieList();
                    System.out.print("Press enter to continue");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    libraryHead.checkMembership(userID);
                    System.out.print("Press enter to continue");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Closing Application");
                    System.out.print("Press enter to continue");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    if (userID!=-1)
                    {
                        libraryHead.showBookList();
                        System.out.print("Select the book:( Enter book id ) :\t\t");
                        libraryHead.reserve((sc.nextInt()-1));
                        break;
                    }
                default:
                    System.out.println("Select a valid option!!");
                    break;

            }
        }
    }

    private static void displayOptions(int userID) {
        if(userID==-1)
            System.out.println("1.Login");
        else
            System.out.println("1.Logout");
        System.out.println("2.List of Books");
        System.out.println("3.List of Movies");
        System.out.println("4.Check Membership details");
        if(userID !=-1)
        {
            System.out.println("5.Reserve a book");
        }
        System.out.println("0.Exit the application");
        System.out.print("\t\tChoose your option:\t\t");
    }
}
