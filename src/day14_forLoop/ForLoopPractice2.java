package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       /* int sum = 0;
        
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number");
            sum += input.nextInt();

        }

        System.out.println("sum = " + sum);


        */

        int result = biggestNum(0);
        System.out.println(result + " is the biggest number");



        // write a program that can ask the user to enter a number for five times, print the maximum number


    }

    public static int biggestNum(int num){

        Scanner input = new Scanner(System.in);
        int biggest = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            num = input.nextInt();
            if(num > biggest){
                biggest = num;
            }

        }

        return biggest;

    }
}
