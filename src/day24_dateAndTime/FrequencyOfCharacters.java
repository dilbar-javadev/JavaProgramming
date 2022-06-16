package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        //find frequency of each character
        //result should be : a3b4c5

        String result = "";
        str.split("");

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if(!result.contains(each)){
                result += each + frequency;
            }
        }

        System.out.println(result);


    }
}
