package day11_stringMethods;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = " ";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("-------------------------------------------------");

        String str = "        ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));



        System.out.println("-------------------------------------------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));  //false
        System.out.println(s1.equalsIgnoreCase(s2));  //true

        System.out.println("-------------------------------------------------");

        String students = "Hasan Naran Sumeye Natalia";

        boolean hasAhmad = students.contains("Ahmed");

        System.out.println(hasAhmad);

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println(hasJava);


        System.out.println("-------------------------------------------------");

        String name = "Micheal";

        boolean l = name.startsWith("D");

        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid);

        boolean t = url.endsWith(".com");

        System.out.println(t);

        System.out.println("-------------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("is gmail: " + isGmail);
        System.out.println("is Yahoo: " + isYahoo);
        System.out.println("is hotmail; " + isHotmail);

    }
}
