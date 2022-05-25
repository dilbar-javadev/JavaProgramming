package day11_stringMethods;

import java.util.Scanner;

public class FirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String first = input.next();

        System.out.println("Enter your last name: ");
        String last = input.next();

        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first + " " + last);

        input.close();

    }
}


/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */