package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] array1 = new int[100];

        /*
        for (int i = 0, j = 1; i < array1.length; i++, j++) {

            array1[i] = j;
        }
        System.out.println("array1 = " + Arrays.toString(numbers));
        */

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i+1;
        }

        System.out.println("array1 = " + Arrays.toString(array1));

        int[] array2 = new int[100];

        for (int i = array2.length - 1; i >= 0; i--) {
            array2[i] = 100-i;
        }

        System.out.println("array2 = " + Arrays.toString(array2));

    }
}
