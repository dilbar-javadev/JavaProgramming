package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran","Sumeye", "Abidullah"}; 
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; 
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; 
        String[] group4 = {"Adelina", "Ali"};

        String[][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(groups[i]));
            for (String eachStudent : groups[i]) {
                System.out.println(eachStudent);
            }
            }

        System.out.println("------------------------------------");

        System.out.println(Arrays.deepToString(groups));    // print multi dimensional array






    }
}
