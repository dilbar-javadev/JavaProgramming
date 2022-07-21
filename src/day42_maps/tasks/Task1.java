package day42_maps.tasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        Map<String,int[]> map = new LinkedHashMap<>();

        map.put("A", new int[]{98,65,74,23,58});
        map.put("B", new int[]{56,65,17,23,56});
        map.put("C", new int[]{45,78,69,87,47});
        map.put("D", new int[]{89,47,82,80,58});
        map.put("E", new int[]{47,76,74,81,67});

        map.forEach((k,v) -> System.out.println(k + " : " + Arrays.toString(v)));
    }
}
