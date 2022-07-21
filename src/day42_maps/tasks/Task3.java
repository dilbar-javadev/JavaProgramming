package day42_maps.tasks;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isBefore(LocalDate.of(2015,1,1))){
                System.out.println("Hired before 2015 : " + eachEntry.getKey());
            }
        }

        System.out.println("----------------------------------------");

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isEqual(LocalDate.of(2020,5,15))){
                System.out.println("Hired on 5/15/2020 : " + eachEntry.getKey());
            }
        }

        System.out.println("----------------------------------------");

        int count = 0;
        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isAfter(LocalDate.of(2014,12,31))){
                count++;
            }
        }

        System.out.println("Hired after 2014 : " + count);

        System.out.println("----------------------------------------");

        map.forEach((k,v) -> System.out.println(k  + " : " + v));
    }
}
