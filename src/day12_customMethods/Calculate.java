package day12_customMethods;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 numbers and a operator: ");
        double n1  = input.nextDouble();
        double n2 = input.nextDouble();
        char operator = input.next().charAt(0);

        calculate(n1,n2,operator);

        input.close();
    }

    public static void calculate(double num1, double num2, char mathOperator){

        switch(mathOperator){
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}


/*

1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
            calculate(10, 20, '+')

        output:
            10 + 20 = 30

 */