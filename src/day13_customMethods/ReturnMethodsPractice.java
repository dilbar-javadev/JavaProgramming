package day13_customMethods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println( isEven(67));

        System.out.println(max(2,9));


    }

public static boolean isOdd(int num){
    return (num % 2 != 0)? true: false;
}

public static boolean isEven(int num){
        return !isOdd(num);
}

public static int max(int a, int b){

    return a > b ? a : b;
}
}

