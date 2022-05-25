package day11_stringMethods;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        System.out.println("-------------------------------------------------");


        String word = "java";

        word = word.replace('a','e');

        System.out.println(word);

        System.out.println("-------------------------------------------------");

        String Sentence2 = "I love Java, Java is cool";

        Sentence2 = Sentence2.replaceFirst("Java","Python");

        System.out.println(Sentence2);


        System.out.println("-------------------------------------------------");

        //to replace the second Java

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java",", Python");

        System.out.println(sentence3);


        System.out.println("-------------------------------------------------");

        String sentence4 = "I love Java Programming";

        int index = sentence4.indexOf('J');

        System.out.println(index);

        String languageName = sentence4.substring(7,11);

        System.out.println(languageName);

        System.out.println("-------------------------------------------------");

        String sentence5 = "Today is Sunday, Tomorrow is Monday";

        int index2 = sentence5.indexOf('S');
        int index3 = sentence5.indexOf("y,");

        System.out.println(index2);
        System.out.println(index3);

        String today = sentence5.substring(9,15);
        System.out.println(today);


        System.out.println("-------------------------------------------------");

        String email = "gmail@yahoo.com";

        int beginning = email.indexOf("@") + 1;
        int last = email.lastIndexOf(".");

        String domain = email.substring(beginning,last);
        System.out.println(domain);

        System.out.println("-------------------------------------------------");

        String sentence6 = "I love Java programming";

        //String r1 = sentence6.substring(7,sentence6.length());
        String r1 = sentence6.substring(7);

        System.out.println(r1);

        System.out.println("-------------------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Friday";

        int lastSpace = sentence7.lastIndexOf(" ");

        String tomorrow = sentence7.substring(lastSpace+1);

        System.out.println(tomorrow);


        System.out.println("-------------------------------------------------");

        String str = "Python";

        String result = (str + "\n").repeat(10);

        System.out.println(result);


    }
}
