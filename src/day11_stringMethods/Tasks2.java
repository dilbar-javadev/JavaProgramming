package day11_stringMethods;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {


        /*

         Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = input.next();

        System.out.println("Enter second word: ");
        String word2 = input.next();

        String word = word1.substring(1) + word2.substring(1);
        System.out.println(word);

        /*

        Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
     */

        System.out.println("Enter third word: ");
        String word3 = input.next();
       // System.out.println(word3.length());

        System.out.println("Enter fourth word: ");
        String word4 = input.next();

        char last = word3.charAt(word3.length()-1);
        char first = word4.charAt(0);

        if(last == first){
            System.out.println(word3 + word4.substring(1));
        }else{
            System.out.println(word3 + word4);
        }


    }
}
