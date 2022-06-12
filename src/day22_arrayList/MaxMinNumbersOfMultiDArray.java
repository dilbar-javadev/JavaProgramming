package day22_arrayList;

public class MaxMinNumbersOfMultiDArray {

    public static void main(String[] args) {

        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };
        int max = array[0][0];
        int min = max;

        for (int[] arr1D : array) {
            for (int each : arr1D) {
                if(each > max){
                    max = each;
                }
                if(each < min){
                    min = each;
                }
            }
        }
        System.out.println("Maximum number is: " + min);
        System.out.println("Minimum number is: " + max);


    }
}
