package day18_garbageCollection;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "aaabbccccddeeee";

        int highest = 0;
        char highestFrequency = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count >= highest) {
                highest = count;
                highestFrequency = ch;
            }
            System.out.println(highestFrequency);
        }

    }
}


/*

Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e

 */
