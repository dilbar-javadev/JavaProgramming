package day14_forLoop;

public class WarmUpTasks {
    public static void main(String[] args) {
        System.out.println(combine( "one","eight"));

        String s1 = "" + true;
        System.out.println(s1);

        System.out.println("--------------------------------------------------------------");
    }

    public static String combine(String str1, String str2){

        String result;

        /*
        Solution 1:

        if(str1.endsWith( "" + str2.charAt(0))){
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }
        */

        // Solution 2:

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }

        return result;
    }

    public static int sumOf2IntegerNumbers(int n1, int n2){
        return n1 + n2;
    }

    public static int sumOf3IntegerNumbers(int n1, int n2, int n3){
       // return n1 + n2 + n3;

        return sumOf2IntegerNumbers(n1, n2) + n3;
    }

    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4){
        // return n1 + n2 + n3 + n4;
        return sumOf3IntegerNumbers(n1, n2, n3) + n4;
    }



}
