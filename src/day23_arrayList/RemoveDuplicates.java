package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");   // 0
        names.add("Vasyl");   // 1
        names.add("Sumeye");  // 2
        names.add("Sumeye");  // 3
        names.add("Ali");     // 4
        names.add("Sumeye");  // 5

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : names) {
            if(nonDup.contains(each)) {
                continue;
            }

            nonDup.add(each);
        }

        names = nonDup;

        System.out.println(names);
    }
}
