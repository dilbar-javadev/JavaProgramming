package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'D';
        String result = "";
/*
        if(grade == 'A'){
            result = "Excellent";
        }else if(grade == 'B'){
            result = "Great Job";
        }else if(grade == 'C'){
            result = "Good";
        }else if(grade == 'D'){
            result = "Passed";
        }else{
            result = "Failed";
        }

        System.out.println(result);
*/

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");

        }

    }
}

   /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */