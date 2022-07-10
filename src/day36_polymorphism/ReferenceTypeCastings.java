package day36_polymorphism;

import day29_interitance.animalTask.Animal;
import day29_interitance.animalTask.Cat;
import day29_interitance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Driver;
import day33_abstraction.employeeTask.Employee;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Animal animal = (Animal) new Dog();

        System.out.println("----------------------------------------------------");

        Animal animal1 = new Dog();  //upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "white");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ((Dog)animal1).bark();   // down casting

        //Dog dog1 = (Dog)animal1;   // down casting
        //dog1.bark();

        //((Cat)animal1).scratch();


        System.out.println("------------------------------------------------");

        Phone phone =  new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(123456);
        ((Nokia)phone).selfDefense();

        // ((IPhone)phone).faceTime(123456);  //Nokia cannot be converted to iPhone because there is no "is a" relationship between Nokia and iPhone

        ((Nokia) phone).selfDefense();

        System.out.println("------------------------------------------------");


        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());

        Driver driver = (Driver) employee;


    }
}
