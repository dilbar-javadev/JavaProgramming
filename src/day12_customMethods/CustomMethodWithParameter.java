package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(4);

    }

    public static void oddOrEven(int number){

        if(number  % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }
}
