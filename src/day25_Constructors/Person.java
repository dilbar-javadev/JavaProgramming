package day25_Constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("dd-MM-y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public static void eat(Person person, String food){
        System.out.println(person.name + " is eating " + food);
    }

    public static void sleeping(Person person){
        System.out.println(person.name + " is sleeping");
    }

    public static void isMarried(Person person){
        System.out.println(person.name + " is married : " + person.isMarried);
    }

    public static void isEmployed(Person person){
        System.out.println(person.name + " is employed: " + person.isEmployed);
    }


}


/*
name, age, gender, dateOfBirth, isMarried, isEmployed

 09-02-1993

toString()  eat(String food), sleeping(), drink(String drink)

 */
