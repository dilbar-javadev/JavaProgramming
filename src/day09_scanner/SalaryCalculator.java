package day09_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours you work in a week");
        int hours = input.nextInt();

        System.out.println("Enter the state tax in percentage: ");
        double stateTax = input.nextDouble();

        System.out.println("Enter the federal tax in percentage: ");
        double federalTax = input.nextDouble();

        double salary = hourlyRate * hours;
        System.out.println("Salary: " + salary + " per week");
        System.out.println("State Tax: " + salary * stateTax);
        System.out.println("Federal Tax: " + salary * federalTax);
        System.out.println("Total tax: " + salary * (stateTax+federalTax));
        System.out.println("netIncome: "+ salary * (1-stateTax-federalTax));

        input.close();
    }
}


/*

Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

 */