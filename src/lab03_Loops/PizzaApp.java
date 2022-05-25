package lab03_Loops;

import java.util.Scanner;

public class PizzaApp {


    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        // creat 3 variables named email(String), account number(int), password and assign values
        String email = "mike@gmail.com";
        int accountNumber = 123; // account number can be between >100 and <1000
        String password = "password";

        // ask customer if he/she wants to log in with email(1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account number: 2");
        int loginType = scanner.nextInt();

        for(int i = 3; i > 0; ) { // infinite loop
            //create the selection flow for the login type
            switch (loginType) {
                case 1:   // if I choose login type - 1, should do credential check

                    //Enter your email
                    System.out.println("Enter your email: ");
                    String givenEmail = scanner.next();

                    if(!isEmailValid(givenEmail) ){
                        System.out.println("Invalid Email. Please try again...");
                        continue;
                    }

                    //Enter your password
                    System.out.println("Enter your password: ");
                    String givenPassword = scanner.next();

                    // check if login successful
                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with email");
                        break;
                    } else {  // invalid checking

                        if(i!=1){//ask again

                            System.out.println("Invalid credentials!! left " + (i-1) + " chances to try");

                            i--;  // i = i-1;

                            continue;  // do not execute anything after this point, go back to for loop
                            // break;   stop the loop here, and exit the loop
                            // return;  stop the method you are inside

                        }else{
                            System.out.println("Your account is blocked - try again tomorrow");
                            System.exit(0);  // close the execution of JVM
                        }

                    }


                case 2:
                    System.out.println("Account number login chosen");
                    break;   // stop the switch-case
            }
            break;   // stop the for loop
        }
    }

    public static boolean isEmailValid(String givenEmail){

        //check if the email address is valid:
        //if @ . available , and @ is before .

        int firstSignOfIndex = givenEmail.indexOf('@');
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

        /*
        if (checkEmail) {
            System.out.println("Invalid Email Address");
        }

        */

        if(checkEmail){
            return false;
        }

        return isEmailDomainValid(givenEmail);
    }
    public static boolean isEmailDomainValid(String givenEmail) {

        // check if domain is valid
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        /*

        if (!checkDomain) {
            System.out.println("Invalid Domain");
        }
         */
        return checkDomain;
    }
}
