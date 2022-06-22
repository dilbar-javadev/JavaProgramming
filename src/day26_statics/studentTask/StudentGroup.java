package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students;

    public StudentGroup(String groupName, int groupId) {   // creates the studentsGroup object by setting the groupName and groupID
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>();  // at the beginning, size is 0
    }

    public void addStudent(Student student){   // takes one student object and adds it to the arraylist of students
        students.add(student);
    }

    public void addStudent(String name, int age, char gender, String id){   // takes name, age, gender, id of student
                                                                    // info, create student object by using that info
                                                                    //then adds it to the arraylist of students
     //   Student student = new Student(name, age, gender, id);
        students.add( new Student(name, age, gender, id) );
    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    }// take the id and then removes the student object with the specified id from arraylist of students

    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", total number of students=" + students.size() +
                '}';
    }
}

/*
Create a custom class named StudentsGroup
            Attributes:
                groupName
                groupId
                students (ArrayList<Students>)

            Add a constructor that can set the groupId and groupName
                    initialize students arraylist in the constrcutor's body

            Methods:
                addStudent(Student): adds the specified student to the students arrayList
                removeStudent(id): removes the student with the specified id from the students arraylist
                toString(): displays the groupName, groupId and total number of students when a group object
                is passed in the print statement
 */
