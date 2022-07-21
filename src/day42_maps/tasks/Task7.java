package day42_maps.tasks;

import java.util.*;

public class Task7 {

    public static void main(String[] args) {

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> listOfMaps = new ArrayList<>();
        listOfMaps.addAll(Arrays.asList(unit1,unit2,unit3,unit4,unit5,unit6));

        for (Map<String, Double> eachMap : listOfMaps) {
            eachMap.forEach((k,v) -> System.out.println(k + " : " + v + " hours"));
        }

        System.out.println("---------------------------------");
        System.out.println("topics that we spend more than 7 hours");

        for (Map<String, Double> eachMap : listOfMaps) {
            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getValue() > 7){
                    System.out.println(eachEntry.getKey());
                }
            }
        }

        System.out.println("---------------------------------");
        System.out.println("topics that we spend less than 3 hours");

        for (Map<String, Double> eachMap : listOfMaps) {
            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getValue() < 3){
                    System.out.println(eachEntry.getKey());
                }
            }
        }

        System.out.println("---------------------------------");

        double maxHours = 0, minHours = unit1.get("Print Statements");
        String maxHoursTopic = "", minHoursTopic = "";
        for (Map<String, Double> eachMap : listOfMaps) {
            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getValue() > maxHours){
                    maxHours = eachEntry.getValue();
                    maxHoursTopic = eachEntry.getKey();
                }

                if(eachEntry.getValue() < minHours){
                    minHours = eachEntry.getValue();
                    minHoursTopic = eachEntry.getKey(); 
                }
            }
        }

        System.out.println("Maximum Hours Topic = " + maxHoursTopic + " " + maxHours + " hours");
        System.out.println("Minimum Hours Topic = " + minHoursTopic + " " + minHours + " hours");


    }
}
