package lab05_String;

public class StringMethodsPractice {

    public static void main(String[] args) {

        System.out.println("------------------------------------");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');

        System.out.println(index1);

        int index2 = school.indexOf('j');

        System.out.println(index2);

        String str1 = "Java Programming Language";

        int index3 = str1.indexOf("va") + 1;   // if want to find second 'a'

        System.out.println(index3);

        System.out.println("------------------------------------------------");

        String s1 = "WOODEN SPOON";

        s1 = s1.toLowerCase();  // "wooden spoon"

        System.out.println(s1);

        s1 = s1.toUpperCase(); // "WOODEN SPOON"

        System.out.println(s1);

        System.out.println("------------------------------------------------");

        String sentence = "Today is Thursday, and Thursday is a lab day";

        sentence = sentence.replace("Thursday","Friday");

        System.out.println(sentence);

        System.out.println("------------------------------------------------");

        String s = "Today is Thursday, and tomorrow is Thursday";

        s = s.replaceFirst("Thursday", "Wednesday");

        System.out.println(s);

    }
}
