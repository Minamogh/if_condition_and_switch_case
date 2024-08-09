package org.example;

import org.example.exception.InvalidAgeException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        int age = Integer.parseInt(args[0]);
      //args - is a way of receiving information from outside
        if (age < 0 ) {
            throw new InvalidAgeException();
        } else if (age >= 0 && age <= 18){
            System.out.println("You´re under age!");
        } else if (age > 18 && age <= 65) {
            System.out.println("You´re an adult!");
        } else {
            System.out.println("You´re a vampire!!:D");
        }
    }
}