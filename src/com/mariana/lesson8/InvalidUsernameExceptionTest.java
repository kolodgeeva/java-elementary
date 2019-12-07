package com.mariana.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvalidUsernameExceptionTest {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String username = reader.readLine();
            String password = reader.readLine();
            authorize(username, password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidUsernameException e) {
            System.out.println(String.format("Cannot be authorized! %s", e.getMessage()));
        }
    }

    public static void authorize(String username, String password) throws InvalidUsernameException {
        if (username.equals("hacker")) {
            throw new InvalidUsernameException(username);
        }
    }
}
