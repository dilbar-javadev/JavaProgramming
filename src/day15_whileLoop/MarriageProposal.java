package day15_whileLoop;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = input.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid answer, please re-enter");
            System.out.println("Will you marry me?");
            answer = input.next().toLowerCase();
        }

        if(answer.equals("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }

        input.close();
    }
}
