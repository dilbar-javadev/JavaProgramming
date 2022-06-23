package day28_encapsulation.personTask;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");

        Person person2 = new Person("Abidullah", 'M');

        Person person3 = new Person("Hasan", 30);

        Person person4 = new Person("Daniel", "English");

        Person person5 = new Person("Tatiana", 25, 'F');

        Person person6 = new Person("Lucy", 31, 'F', "English");


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Baklava");

        person5.drink("tea");

        person6.drink("Coffee");
    }
}
