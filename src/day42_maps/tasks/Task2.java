package day42_maps.tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int maxSalary = map.get("John");
        int minSalary = map.get("John");
        int count = 0;
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() > maxSalary){
                maxSalary = eachEntry.getValue();
                String maxSalaryPerson = eachEntry.getKey();
            }
            if(eachEntry.getValue() < minSalary){
                minSalary = eachEntry.getValue();
                String minSalaryPerson = eachEntry.getKey();
            }
            if(eachEntry.getValue() >= 120000 && eachEntry.getValue() <= 150000){
                count++;
            }

            if(eachEntry.getValue() < 118000){
                System.out.println(eachEntry.getKey());
            }

            if(eachEntry.getValue() < 120000){
                eachEntry.setValue(eachEntry.getValue() + 10000);
            }
        }

        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);
        System.out.println("count 120k ~ 150k = " + count);
    }
}
