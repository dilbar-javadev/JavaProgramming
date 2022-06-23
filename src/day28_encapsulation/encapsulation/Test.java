package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();

        student.setAge(25);

        System.out.println(student.getAge());

        //student.setName("Aaron123");

        System.out.println(student.getName());

        System.out.println("Test Completed");
    }
}
