package day11_stringMethods;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String str1 = input.nextLine();

        System.out.println("Enter String 2: ");
        String str2 = input.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        if(length1 > length2){
            System.out.println("First is longest string");
        }else if(length1 < length2){
            System.out.println("Second is longest string");
        }else{
            System.out.println("Equal");
        }

        input.close();
    }
}


/*

Create a class named LongestString
            1.1 Ask the user to enter two strings
            1.2 Write a program that can print the longest string, if both have the same number
            of characters then print "Equal"

 */