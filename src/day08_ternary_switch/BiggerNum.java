package day08_ternary_switch;

public class BiggerNum {
    public static void main(String[] args) {

        int n1 = 9;
        int n2 = 6;
        int n3 = 3;

        String output = (n1 > n2)?(n3>n1)?"n3 is bigger":"n1 is bigger"
                :(n3>n2)?"n3 is bigger":"n2 is bigger";

        System.out.println(output);
    }
}
