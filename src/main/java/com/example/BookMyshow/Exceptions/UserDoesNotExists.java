package com.example.BookMyshow.Exceptions;

public class UserDoesNotExists extends RuntimeException{
    public UserDoesNotExists() {
        super("User does not exists");
    }
}