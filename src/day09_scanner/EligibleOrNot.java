package day09_scanner;

import java.util.Scanner;

public class EligibleOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        String eligible = (age>=21)?"Eligible":"Not Eligible";

        System.out.println(eligible);

        input.close();
    }
}
