package day36_polymorphism;

import day29_interitance.animalTask.Animal;
import day29_interitance.animalTask.Cat;
import day29_interitance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

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

        // Driver driver = (Driver) employee;

        System.out.println("------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla) electric).selfDrive();

        ((AutoPilot) electric).selfDrive();

        System.out.println("------------------------------------------------");

        Employee employee1 = new Teacher("James", 45, 'M', "B1", "Math teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aeron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();

    }
}
