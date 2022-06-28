package day29_interitance.encapsulation;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Hamza", 26, 'M', 'A', "MIT");

        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');

        System.out.println(student1);

    }
}
