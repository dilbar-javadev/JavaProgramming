package day11_stringMethods;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String str1 = input.nextLine();

        if(str1.length()>=1){ //if the string has at least one character

        char f = str1.charAt(0);

            if(f >= 48 && f <= 57){
                System.out.println("first character is digit");
            }else if(f >= 65 && f <= 90){
                System.out.println("first character is uppercase letter");
            }else if(f >= 97 && f <= 122){
                System.out.println("first character is lowercase letter");
            }else{
                System.out.println("first character is special character");
            }

        }else{
            System.out.println("Empty String");
        }

        input.close();

    }
}


/*

Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
            - if the word starts with digits, print "first character is digit"
            - if the word starts with uppercase letters, print "first character is lowercase letter"
            - if the word starts with lowercase letters, print "first character is uppercase letter"
            - if the word starts with special characters, print "first character is special character"


            HINT: You need to check the ascii table

 */