package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your school name: ");
        String school_name = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender =input.next(); // Male+enter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //28+enter

        input.nextLine(); // clear out the scanner
        // we have to give extra nextLine method if we are using a nextLine method after the other methods of scanner

        System.out.println("Enter your street name: ");
        String street_name = input.nextLine();


        System.out.println("Full name is: " + full_name);
        System.out.println("school name is: " + school_name);
        System.out.println("Gender is: " + gender);
        System.out.println("Age is: " + age);
        System.out.println("Street name is: " + street_name);

        input.close();


    }
}
