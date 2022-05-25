package day15_whileLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "Cydeo";
        String password = "Cydeo123";

        System.out.println("Enter your username: ");
        String strUsername = input.nextLine();

        System.out.println("Enter your password: ");
        String strPassword = input.nextLine();

        if(password.equals(strPassword) && username.equals(strUsername)){
            System.out.println("Logged in.");
        }else{
            int count = 0;
                    for (int i = 0; i < 3; i++) {
                        count += 1;
                    System.out.println("Your password or username is incorrect, try again");
                    System.out.println("Username: ");
                    strUsername = input.nextLine();
                    System.out.println("Password: ");
                    strPassword = input.nextLine();
                    if(password.equals(strPassword) && username.equals(strUsername)){
                        System.out.println("Logged in.");
                        break;
                    }
                }
           if(count == 3) System.out.println("Your account is locked");
        }

        input.close();
    }
}

/*

7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */