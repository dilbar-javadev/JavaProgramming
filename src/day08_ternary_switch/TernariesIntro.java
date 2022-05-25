package day08_ternary_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;

        String result;

        if(score >= 60){
            result = "Passed";
        }else{
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("----------------------------------------------");

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);


        System.out.println("----------------------------------------------");

        int age = 34;
        String r;
        if(age >= 21){
            r = "Eligible";
        }else{
            r = "Not Eligible";
        }
        System.out.println(r);

        String r2 = (age >= 21) ? "Eligible" : "Not Eligible";
        System.out.println(r2);

        System.out.println("--------------------------------------------");

        int n = 7;

        String day = (n == 1) ? "Monday" :(n == 2)? "Tuesday" :(n == 3)? "Wednesday" : (n == 4)? "Thursday" : (n == 5)? "Friday" : (n == 6)? "Saturday" : "Sunday";

        System.out.println(day);

        System.out.println("-------------------------------------------------------");

        int num = 11; // 1-12

        String month = (num==1)?"January":(num==2)?"February":(num==3)?"March":(num==4)?"April"
                :(num==5)?"May":(num==6)?"June":(num==7)?"July":(num==8)?"August":(num==9)?"September"
                :(num==10)?"October":(num==11)?"November":"December";

        System.out.println(month);

    }
}
