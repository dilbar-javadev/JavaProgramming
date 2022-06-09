package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int element = 90;

        //{1, 2, 3, 4, 5, 6}

        int[] new_array = Arrays.copyOf(array, array.length+1);
        new_array[array.length] = element;
        System.out.println(Arrays.toString(new_array));

        System.out.println("----------------------------------------------");

        int[] numbers = {100, 90, 80, 70, 60};

        numbers = ArraysUtility.addElement(numbers,50);

        System.out.println(Arrays.toString(numbers));


        System.out.println("----------------------------------------------");

        double nums[] = {1.2, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 7.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------------");

        String[] names = {"Yasin", "Sumeye", "Ermek"};

        names = ArraysUtility.addElement(names, "Ali");

        names = ArraysUtility.addElement(names, "Muhtar");

        names = ArraysUtility.addElement(names, "Alvis");

        System.out.println(Arrays.toString(names));


    }
}
