package day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {


        System.out.println(square(6));

    }

    public static int sum(int n1, int n2){

        int result = n1 + n2;
        return result;

    }

    public static int square(int num){

        int square = num * num;
        return square;

    }
}
