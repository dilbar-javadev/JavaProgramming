package day25_Constructors;

import java.time.LocalDate;

public class TestPersonClass {

    public static void main(String[] args) {

        Person person1 = new Person("Ali", 30,'M', LocalDate.of(1992,7,18),true,true);
        Person person2 = new Person("Dilbar", 29, 'F', LocalDate.of(1993,2,9),true,false);

        System.out.println(person1);
        System.out.println(person2);

        Person.isEmployed(person2);
        Person.eat(person1,"burger");
        Person.sleeping(person1);
        Person.isMarried(person2);
    }
}
