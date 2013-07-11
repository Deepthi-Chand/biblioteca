package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static com.twu.biblioteca.TestHelper.captureOutput;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    BibliotecaApp bibliotecaApp;
    @Test
    public void displayOptionsBeforeLoginTest() throws Exception {
        captureOutput(new CaptureTest() {
            @Override
            public void test(ByteArrayOutputStream outContent, ByteArrayOutputStream errContent) throws Exception {
                int userID=-1;
                bibliotecaApp.displayOptions(userID);
                String displayString = "1.Login\r\n2.List of Books\r\n3.List of Movies\r\n4.Check Membership details\r\n0.Exit the application\r\n\t\tChoose your option:\t\t";
                assertEquals(displayString, outContent.toString());
            }
        });
    }
    @Test
    public void displayOptionsAfterLoginTest() throws Exception {
        captureOutput(new CaptureTest() {
            @Override
            public void test(ByteArrayOutputStream outContent, ByteArrayOutputStream errContent) throws Exception {
                int userID=1;
                bibliotecaApp.displayOptions(userID);
                String displayString = "1.Logout\r\n2.List of Books\r\n3.List of Movies\r\n4.Check Membership details\r\n5.Reserve a book\r\n0.Exit the application\r\n\t\tChoose your option:\t\t";
                assertEquals(displayString, outContent.toString());
            }
        });
    }

    @Test
         public void showBookListTest() throws Exception {
        captureOutput(new CaptureTest() {
            @Override
            public void test(ByteArrayOutputStream outContent, ByteArrayOutputStream errContent) throws Exception {
                bibliotecaApp.showBookList();
                String displayString="1: FirstBook\n\t\tAvailable:\ttrue\n2: Second Book\n\t\tAvailable:\ttrue\n3: Third Book\n\t\tAvailable:\ttrue\n";
                assertEquals(displayString,outContent.toString());
            }
        });
    }
    @Test
    public void showMovieListTest() throws Exception {
        captureOutput(new CaptureTest() {
            @Override
            public void test(ByteArrayOutputStream outContent, ByteArrayOutputStream errContent) throws Exception {
                bibliotecaApp.showMovieList();
                String displayString="ID \t Movie  \t Year \t Director \t Rating"+"\n"+"------------------------------------------"+"\n";
                displayString+="1 \tMovie 1 \t1991 \tdirector 1  \t6 \n2 \tMovie 2 \t1992 \tdirector 2  \t5 \n3 \tMovie 3 \t1993 \tdirector 3  \t4 \n4 \tMovie 10 \t2001 \tdirector 10  \tN/A \n5 \tMovie 13 \t2004 \tdirector 13  \tN/A \n6 \tMovie 15 \t2006 \tdirector 15  \tN/A \n";
                assertEquals(displayString,outContent.toString());
            }
        });
    }

}
