package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;

        for(int i = 0; i < 5; i++ ){  // i: 0,1,2,3,4

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num > max){ // if the user entered entry is greater than the current maximum number taht we have
                max = num; // then user entered number should be the maximum number
            }
        }

        System.out.println("Maximum number is: " + max);

        input.close();
    }
}
