package day42_maps.tasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {

    public static void main(String[] args) {

        String[] group1 = {"A", "B", "C", "D", "E"};
        String[] group2 = {};
        String[] group3 = {};
        String[] group4 = {};
        String[] group5 = {};

        Map<Integer, String[]> groups = new LinkedHashMap();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        for (String eachName : groups.get(1)) {
            System.out.println(eachName);
        }

        groups.forEach((k,v) -> System.out.println(Arrays.toString(v)));



    }
}
