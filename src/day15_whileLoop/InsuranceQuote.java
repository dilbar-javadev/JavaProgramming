package day15_whileLoop;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int price = 0;

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your gender: male/female");
        String gender = input.next().toLowerCase();
        while(!(gender.equals("male") || gender.equals("female"))){
            System.err.println("Invalid entry! Please re-enter your gender.");
            gender = input.next().toLowerCase();
        }

        System.out.println("Are you married? Yes/No");
        String married = input.next().toLowerCase();
        while(! (married.equals("yes") || married.equals("no"))){
            System.err.println("Invalid entry! Please re-enter your marriage status.");
            married = input.next().toLowerCase();
        }

        System.out.println("How old are you?");
        int age = input.nextInt();
        while(!(age>0 && age<=120)){
            System.err.println("Invalid entry! Please re-enter your age.");
            age = input.nextInt();
        }

        System.out.println("How many miles you drive in a day?");
        int miles = input.nextInt();
        while(! (miles >= 5)){
            System.err.println("Invalid entry! Please re-enter your mileage.");
            miles = input.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance?");
        input.nextLine();
        String coverage = input.nextLine().toLowerCase();
        while(! (coverage.equals("full coverage") || coverage.equals("liability"))){
            System.err.println("Invalid entry! Please re-enter your choice.");
            coverage = input.nextLine().toLowerCase();
        }

        System.out.println("Did you have any accidents or claims in past 5 years (Yes/No)");
        String accident = input.next().toLowerCase();
        while(! (accident.equals("yes") || accident.equals("no"))){
            System.err.println("Invalid entry! Please re-enter your answer.");
            accident = input.next().toLowerCase();
        }

        System.out.println("Does your car have an anti-theft device (Yes/No)");
        String device = input.next().toLowerCase();
        while(! (device.equals("yes") || device.equals("no"))){
            System.err.println("Invalid entry! Please re-enter your answer.");
            device = input.next().toLowerCase();
        }

        if(coverage.equals("liability")){
            price = (age<25)?90:50;
            price += (miles<=10)?10 :(miles>10 && miles<=50)?30:50;

        }else{  // full coverage
            price = (age<25)?160:120;
            price += (miles<=10)?20 :(miles>10 && miles<=50)?40:70;
        }

        if(device.equals("yes")){
            price *= 0.95;
        }

        if(accident.equals("yes")){
            price *= 1.15;
        }else{
            price *= 0.9;
        }

        if(married.equals("yes")){
            price *= 0.95;
        }

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Married? " + married);
        System.out.println("Age: " + age);
        System.out.println("Mileage a day: " + miles);
        System.out.println("Coverage type: " + coverage);
        System.out.println("Accidents or claims in past 5 years: " + accident);
        System.out.println("If the car has an anti-theft device: " + device);
        System.out.println("Your insurance cost is: " + price);
        input.close();

    }
}


/*

10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount

 */