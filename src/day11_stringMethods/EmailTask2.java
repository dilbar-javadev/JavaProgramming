package day11_stringMethods;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = input.nextLine();

        String first = email.substring(0,email.indexOf('_'));
        String last = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String afterAt = email.substring(email.indexOf('@')+1);
        String domain = afterAt.substring(0,afterAt.indexOf('.'));

        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("Domain: " + domain);

        input.close();

    }

}

/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */


