package day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if(month < 1 || month > 12){
            System.out.println("Invalid number");
            return; //terminates the main method
        }

        switch(month){

            case 2:
                System.out.println("28 days");
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("31 days");
            default:
                System.out.println("30 days");
        }
    }
}
