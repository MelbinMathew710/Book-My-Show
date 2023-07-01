package com.example.BookMyshow.Exceptions;

public class UserAlreadyExistsWithEmail extends RuntimeException {
    public UserAlreadyExistsWithEmail() {
        super("User Already Exists with this EmailId");
    }
}