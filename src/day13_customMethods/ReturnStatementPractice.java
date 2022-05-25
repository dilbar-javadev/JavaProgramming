package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {


        int grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(!isValid){  //　if the grade is invalid
            System.out.println("Invalid grade");
            return;  //terminates the main method
        }

        System.out.println((grade == 'A')? "Excellent" :(grade == 'B')? "Great job" :(grade == 'C')? "Good"
                :(grade == 'D')? "Passed" : "Failed");


    }
}
