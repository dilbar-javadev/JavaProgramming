package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "James";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[2] = "Sumeye";
        myGroup[1] = "Abdula";
        myGroup[3] = "Kashayar";

        myGroup[1] = "Kuzzat";

        System.out.println(Arrays.toString(myGroup));


        System.out.println("--------------------------------------");

        for (int i = myGroup.length-1; i >= 0 ; i--) {    //  shortcut :  myGroup.forr

            System.out.println(myGroup[i]);

        }

        System.out.println("--------------------------------------");

        for (int i = 0; i < myGroup.length; i++) {      //  shortcut: myGroup.fori

            System.out.println(myGroup[i]);

        }



    }
}
