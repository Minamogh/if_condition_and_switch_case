package org.example.exception;

public class InvalidColorException extends Exception {
    public InvalidColorException(){
        super("Oops! It´s not an valid color!");
    }
}
