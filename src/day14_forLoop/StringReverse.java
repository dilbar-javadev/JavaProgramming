package day14_forLoop;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

   /*     Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String str1 = input.nextLine();
        String reverse ="";

        for(int i = str1.length()-1; i >= 0; i--){
            reverse += str1.charAt(i);
        }

        System.out.println(reverse);

    */

        System.out.println(reverse("Dilbar Tayir"));
    }

    public static String reverse(String str){

        String reverse ="";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
