package day15_whileLoop;

import java.util.Scanner;

public class RommReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("If you want to reserve a room?");
        String answer = input.next().toLowerCase();

        while(! (answer.equals("yes") || answer.equals("no"))){
            input.nextLine();
            System.err.println("Invalid answer! Please re-enter");
            answer = input.next().toLowerCase();
        }

        if(answer.equals("yes")){
            System.out.println("Which type of room you want to reserve?\nKing Bed\nQueen Bed\nsingle Bed");
            input.nextLine();
            String roomType = input.nextLine().toLowerCase();

            while(!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))){
                System.err.println("Invalid Entry! Please re-enter");
                roomType = input.nextLine().toLowerCase();
            }

            if(roomType.equals("king bed")){
                System.out.println("King Bed ==> 120$");
            }else if(roomType.equals("queen bed")){
                System.out.println("Queen Bed ==> 100$");
            }else{
                System.out.println("single Bed ==> 80$");
            }

        }else{
            System.out.println("Have a nice day");
        }
        input.close();
    }
}

/*

8. Create a class called RommReservation, write a program for the room reservation, your program asks the user
wants to reserve a room. if user entered yes, then ask which type of room the user wants to reserve. if user
entered no, print "have a nice day" (if user entered any invalid answer (other than yes/no) ask user to reenter until
 user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */