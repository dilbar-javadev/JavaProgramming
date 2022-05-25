package day11_stringMethods;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        String website = "www.abc.gov";
        if(website.startsWith("www.")&&(website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov"))){
            System.out.println("Is valid");
        }else{
            System.out.println("Not valid");
        }


       /* Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                Input:
                     xcodex
                Output:
                      acodex

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.next();

        if(word.startsWith("x")){
            word = word.replace("x","a");
            System.out.println(word);
        }else{
            System.out.println(word);
        }

       /* Write a program that asks user to enter a word. and replace all the x or X with character a
        Input:
            xcodeX
        Output:
            acodea

        */

        System.out.println("please enter another word");
        String word2 = input.next();
        word2 = word2.toLowerCase();
        word2 = word2.replace("x","a");
        System.out.println(word2);

       /* ask the user to enter a word. if the word ends with "ly", print "really???" ,
        otherwise, print "never mind"
        */

        System.out.println("Enter a word: ");
        String word3 = input.next();
        if(word3.endsWith("ly")){
            System.out.println("really??");
        }else{
            System.out.println("never mind");
        }

    }
}
