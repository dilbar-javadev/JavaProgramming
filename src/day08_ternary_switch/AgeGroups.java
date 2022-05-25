package day08_ternary_switch;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 90;
        String group = (age >= 1 && age < 3)?"infant":(age >= 3 && age < 6)?"Toddler"
                      :(age >= 6 && age < 10)?"Kid":(age >= 10 && age < 13)?"Pre-Teen"
                      :(age >= 13 && age < 18)?"Teenager":(age >= 18 && age < 21)?"Young Adult"
                      :(age >= 21 && age < 40)?"Adult":(age >= 40 && age < 50)?"Young Middle-Aged Adult"
                      :(age >= 50 && age < 55)?"Middle-Aged Adult":(age >= 55 && age < 65)?"Very Young Senior Citizen"
                      :(age >= 65 && age < 75)?"Young Senior Citizen":(age >= 75 && age < 85)?" Senior Citizen"
                      :" Old Senior Citizen";

        System.out.println(group);


    }

    /*

    Create a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary

     */
}
