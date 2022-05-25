package day12_customMethods;

import java.util.Scanner;

public class FirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String first = input.next().trim();

        System.out.println("Enter last name: ");
        String last = input.next().trim();

        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        System.out.println(first + " " + last);

        input.close();

    }
}
