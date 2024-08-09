package org.example.exception;

public class InvalidAgeException extends Exception {
  public InvalidAgeException(){
      super("Oops! It´s not an valid age!");
  }
}
