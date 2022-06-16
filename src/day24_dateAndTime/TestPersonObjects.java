package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1959, 2,25));
        people[1].setInfo("Ali",'M',LocalDate.of(1992,7,18));
        people[2].setInfo("Alvis", 'M', LocalDate.of(2020,8,24));
        people[3].setInfo("Dilbar", 'F', LocalDate.of(1993,2,9));
        people[4].setInfo("Muxuk", 'F', LocalDate.of(1986,7,4));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        for (Person each : studentsList) {
            System.out.println("Name : " + each.name + ", Date of Birth : " + each.dateOfBirth);
        }

        studentsList.removeIf(p -> p.age > 55);
        for (Person each : studentsList) {
            System.out.println(each.name);
            System.out.println(each.age);
        }

        //print name & date of birth of each person object
        // remove all the person object that has age > 55


    }
}
