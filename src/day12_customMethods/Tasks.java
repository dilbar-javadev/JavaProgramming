package day12_customMethods;

public class Tasks {
    public static void main(String[] args) {

        emailDomain("Cydeo@gmail.com");
        capitalization("DiLBaR","tAyIR");
        monthName(7);
        day(6);
        daysOfMonth("feBruAry");
        eligibleToVote(35,false);
        salary(45,40);

        String str3 = new String();

        String str1 = "Zero to hero";
        System.out.println(str1.substring(8,11));
    }

    public static void emailDomain(String email){

        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("domain: " + domain);

    }

    public static void capitalization(String first, String last){

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
        System.out.println("full name: " + first + " " + last);

    }

    public static void monthName(int month){

        switch(month){

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Number");
        }


    }

    public static void day(int day){

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }

    }

    public static void daysOfMonth(String month){

        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();

        if(month.equals("January")|| month.equals("March")|| month.equals("May" )|| month.equals("July")|| month.equals("August")|| month.equals("October")|| month.equals("December"))
        {
            System.out.println(month + " has 31 days");
        }else if(month.equals("February")){
            System.out.println(month + " has 28 days");
        }else{
            System.out.println(month + " has 30 days");
        }

    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.err.println("Not Eligible");
        }
    }

    public static void salary(double hourlyRate, int weeklyHours){

        System.out.println("You make $" + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHours + " hours in a week");
        System.out.println("Your gross income is $" + hourlyRate * weeklyHours * 52);
    }





}

/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

2. Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

3. Create a method named monthName that can display the name of the month based on the given number to
the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June

4. Create a method named day that can display the name of the day based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote

7. Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0


 */