package day12_customMethods;

public class CustomMethodIntro2 {

    public static void main(String[] args) {

        eligible(40);
        oddEvenOrZero(54);
        initials("dilbar","tayir");
        biggerNumber(5,8);

    }

    public static void eligible(int age){

        if(age >= 21){
            System.out.println("eligible to buy alcohol");
        }else{
            System.out.println("not eligible");
        }
    }

    public static void oddEvenOrZero(int number){

        if(number == 0){
            System.out.println(number + " is zero");
        }else if(number % 2 == 0){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is a odd number");
        }

    }

    public static void initials(String first, String last){

        first = first.substring(0,1).toUpperCase();
        last = last.substring(0,1).toUpperCase();
        System.out.println("Initial of the name is: " + first + "." + last);

    }

    public static void biggerNumber(double num1, double num2){

        if(num1 > num2){
            System.out.println(num1 + " is bigger than " + num2);
        }else if(num1 < num2){
            System.out.println(num2 + " is bigger than " + num1);
        }else{
            System.out.println("2 numbers are equal");
        }

    }
}
