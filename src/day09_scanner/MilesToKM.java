package day09_scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles = input.nextDouble();
        System.out.println(miles + " miles equal to " + 1.609*miles + " kilometers");
        input.close();
    }
}


/*

Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */