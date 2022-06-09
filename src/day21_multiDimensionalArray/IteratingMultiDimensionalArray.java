package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] array2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};

        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));

            for (int j = 0; j < array2D[i].length; j++) {  // j: index number of elements in each 1D array of arr2D

                int eachElement = array2D[i][j];
                System.out.println(eachElement);
            }

        }

        System.out.println("------------------------------------------");

        for (int[] each1DArray : array2D) {
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------------------------");

        for (int i = array2D.length-1; i >= 0 ; i--) {
            for (int j = array2D[i].length-1; j >= 0 ; j--) {
                System.out.println(array2D[i][j]);
            }
        }

        System.out.println("------------------------------------------");

        for (int[] each1DArray : array2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }
    }
}
