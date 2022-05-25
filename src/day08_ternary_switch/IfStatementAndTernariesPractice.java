package day08_ternary_switch;

public class IfStatementAndTernariesPractice {

    public static void main(String[] args) {

        int score = 200;

        String result1 = "";

        if(score >= 0 && score <= 100){

            result1 = (score >= 90)?"A":(score >= 80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        }else{
            result1 = "Invalid Score";
            System.out.println(result1);
        }

        System.out.println("--------------------------------------");

        String result2 = (score >= 0 && score <= 100)?
                         (score >= 90)?"A":(score >= 80)?"B":(score>=70)?"C":(score>=60)?"D":"F"
                        :"Invalid Score";

        System.out.println(result2);

    }
}
