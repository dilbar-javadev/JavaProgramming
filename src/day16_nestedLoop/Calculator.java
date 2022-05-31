package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")) {

            System.out.println("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.println("Enter a math operator: ");
            char operator = input.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.out.println("Invalid! Please re-enter");
                operator = input.next().charAt(0);
            }

            System.out.println("Enter second number: ");
            double num2 = input.nextDouble();

            double result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2 : (operator == '*') ? num1 * num2 : num1 / num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();
            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer! Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }

        }

    }
}



