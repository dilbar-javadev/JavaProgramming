package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine();

        System.out.println("Please enter a character: ");
        char character = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character){
                count += 1;
            }
        }

        System.out.println(count);

        input.close();
    }
}


/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */