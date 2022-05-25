package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score");

        int score = input.nextInt();
        String grade = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80 && score < 90) {
                grade = "B";
            } else if (score >= 70 && score < 80) {
                grade = "C";
            } else if (score >= 60 && score < 70) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
            grade = "Invalid";
        }

        System.out.println(grade);
        input.close();
    }
}

/*
Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */