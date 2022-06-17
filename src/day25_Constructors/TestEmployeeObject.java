package day25_Constructors;

import java.time.LocalDate;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("ali",30,'M',"Java Developer", 95000, LocalDate.of(2023,12,2));

        Employee e2 = new Employee("Mohammad", 31,'M', "Project Manager", 120000, LocalDate.of(2021,5,1));

        System.out.println(e1);
        System.out.println(e2);


    }
}
