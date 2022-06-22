package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};

        StudentGroup group1 = new StudentGroup("Java Turtles", 1);

        group1.addStudent(student1);
        group1.addStudent(students);
        group1.addStudent("Khashayar", 34,'M', "F35");

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }


        System.out.println("--------------------------------------------------");

        StudentGroup group2 = new StudentGroup("Java Pandas", 2);

        StudentGroup group3 = new StudentGroup("Java Cats", 3);

        StudentGroup group4 = new StudentGroup("Java Dogs", 4);

        StudentGroup[] groups = {group1, group2, group3, group4};
    }
}


/*
Create a class named TestObjects
            3.1 Create 5 Student objects
            3.2 Create a StudentGroup object
            3.3 Add all the student objets to the StudentsGroup object' students list
 */
