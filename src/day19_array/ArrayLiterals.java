package day19_array;

import java.util.Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {10,20,30,40,50};   // Array literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));


        System.out.println("----------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = 1;

        System.out.println(days[n-1]);


        System.out.println("----------------------------------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("month = " + Arrays.toString(month));

        System.out.println("----------------------------------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);
        }
    }
}
