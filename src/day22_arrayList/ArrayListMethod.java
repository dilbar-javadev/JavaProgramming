package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(list.get(1));

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        System.out.println("--------------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Mohammad");
        studentList.add("Abdurasul");
        studentList.add("Abdullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);

        System.out.println(studentList.get(0));   // first student's name
        System.out.println(studentList.get(studentList.size()-1));   // last student's name


    }
}
