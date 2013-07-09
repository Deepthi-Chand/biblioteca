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
    } @Test
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
}
