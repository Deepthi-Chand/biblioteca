package com.twu.biblioteca;
import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("ResultOfMethodCallIgnored")
public class BibliotecaApp {
    static Library libraryHead= new Library();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=-1;
        int userID=-1;
        String loginID;
        while(flag!=0)
        {
            welcomeMessage();
            displayOptions(userID);
            flag=sc.nextInt();
            switch(flag)
            {
                case 1:
                    if(userID!=-1)
                        userID=-1;
                    else
                    {
                        System.out.println("Enter your credentials");
                        System.out.print("Username(library number):\t");
                        loginID=sc.next();
                        System.out.print("Password:\t");
                        userID=libraryHead.login(loginID,sc.next());
                        if(userID==-2)
                        {
                            System.out.println("Invalid details");
                            userID=-1;
                            pressEnter();
                        }
                    }
                    break;
                case 2:
                    showBookList();
                    pressEnter();
                    break;
                case 3:
                    showMovieList();
                    pressEnter();
                    break;
                case 4:
                    System.out.println(libraryHead.checkMembership(userID));
                    pressEnter();
                    break;
                case 0:
                    System.out.println("Closing Application");
                    pressEnter();
                    break;
                case 5:
                    if (userID!=-1)
                    {
                        showBookList();
                        System.out.print("Select the book:( Enter book id ) :\t\t");
                        switch (libraryHead.reserve((sc.nextInt()-1)))
                        {
                            case 1:
                                System.out.println("Wrong ID of Book");
                                break;
                            case 2:
                                System.out.println("Book Successfully reserved");
                                break;
                            case 3:
                                System.out.println("Cannot reserve Book");
                                break;
                        }
                        break;
                    }
                default:
                    System.out.println("Select a valid option!!");
                    break;

            }
        }
    }


    private static void pressEnter() {
        System.out.print("Press enter to continue");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void welcomeMessage() {
        System.out.println("\t\tWelcome To Biblioteca");
        System.out.println("\t\t\t\tMENU");
    }

    public static void displayOptions(int userID) {
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

    public static void showBookList() {
        String printString=libraryHead.getBookDetails();
        while(!printString.equals(""))
        {
            System.out.print(printString);
            printString=libraryHead.getBookDetails();
        }
    }

    public static void showMovieList() {
        String printString="ID \t Movie  \t Year \t Director \t Rating"+"\n"+"------------------------------------------"+"\n";
        while(!printString.equals(""))
        {
            System.out.print(printString);
            printString=libraryHead.getMovieDetails();
        }
    }
}
