package day18_garbageCollection;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "aaabbccccddeeee";

        int highest = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count++;
                    if(count > highest) {
                        highest = count;
                        result = ch + "\n";
                    }else if(count == highest){
                        result += ch + "\n";
                    }
                }
            }
        }
        System.out.println(result);
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
