package day14_forLoop;

import utilities.StringUtility;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

       for (int i = 0; i < 8; i++) {

            System.out.println("\t\t* * * * * * ");

        }


        for (int i = 1; i <= 100; i++) {
            if(i%3 ==0 && i%5 == 0){
                System.out.print(" FINRA");
            }else if(i%3 == 0){
                System.out.print(" FIN");
            }else if(i%5 == 0){
                System.out.print(" RA");
            }else{
                System.out.print(" " + i);
            }
        }

        System.out.println();

        System.out.println("-------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a number");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("----------------------------------");

        System.out.println("Enter a number");
        n = input.nextInt();
        int factNum = 1;
        for (int i = n; i > 1; i--) {
            factNum *= i;
        }

        System.out.println("The factorial number of " + n + " is: " + factNum);


        System.out.println("----------------------------------");

        System.out.println("Enter a string: ");
        input.nextLine();
        String str = input.nextLine();
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                letters += str.charAt(i);
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digits += str.charAt(i);
            }else{
                specialChars += str.charAt(i);
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);



        System.out.println("----------------------------------");

        String str3 = "A1B2C8374NMJ";
        String digit = "";
        int sum2 = 0;
        for (int i = 0; i < str3.length(); i++) {
            if(str3.charAt(i) >= '0' && str3.charAt(i) <= '9'){
                digit += str3.charAt(i);
            }
        }

        for (int i = 0; i < digit.length(); i++) {
            sum2 += digit.charAt(i) - 48;
        }

        System.out.println("Sum of the digit numbers is: " + sum2);




        String str4 = "dada";
        String formerHalf = "";
        String laterHalf = "";

        if(str4.length() % 2 == 0){
            formerHalf = str4.substring(0,str4.length()/2);
            laterHalf = StringUtility.reverse(str4.substring(str4.length()/2));
        }else{
            formerHalf = str4.substring(0,str4.length()/2);
            laterHalf = StringUtility.reverse(str4.substring(str4.length()/2+1));
        }

        if(formerHalf.equalsIgnoreCase(laterHalf)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}


/*
1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

2. Write a method which prints out the numbers
from 1 to 100 but for numbers which are a multiple of both 3 and 5,
print "FINRA" instead of the number,  for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5,
print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN

3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */

