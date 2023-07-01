package com.example.BookMyshow.Exceptions;

public class TheaterIsPresentOnThatAddress extends RuntimeException{
    public TheaterIsPresentOnThatAddress() {
        super("Theater is already Present on this Address");
    }
}