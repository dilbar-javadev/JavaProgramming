package day22_arrayList;

import org.w3c.dom.ls.LSOutput;

public class WrapperClassIntro {

    public static void main(String[] args) {

        String str = "java";

        int a1 = 10;
        Integer a2 = 10;

        System.out.println("----------------------------------");

        int b1 = 100;
        Integer b2 = b1;   //  auto boxing

        char ch = 'A';

        Character ch2 = ch;

        double d1 = 5.5;

        Double d2 = d1;  // Auto boxing;

        System.out.println("----------------------------------");

        Integer n1 = 20;

        int n2  = n1;   // unboxing
      //  long n3 = n1;
      //  double n4 = n1;

        Character e1 = 'Z';

        char e2 = e1;  // unboxing

        //int e3 = e1;

    }


}
