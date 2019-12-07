package com.mariana.lesson8;

public class InvalidUsernameException extends Exception {

    String username;

    public InvalidUsernameException(String username) {
        super(String.format("User %s is invalid", username));
        this.username = username;
    }
}
