package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minimum = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int n = input.nextInt();
            if(n < minimum){ minimum = n; }
        }

        System.out.println("minimum number is: " + minimum);

        input.close();
    }
}
