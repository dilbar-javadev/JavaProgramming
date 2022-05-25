package day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();

        if(num%2==0) {
            System.out.println("It's an even number.");
        }else{
            System.out.println("It's an odd number");
        }

        input.close();
    }
}
