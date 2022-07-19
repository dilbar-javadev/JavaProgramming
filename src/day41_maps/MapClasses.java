package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashmap = new HashMap<>();   // random order, accept null key & null values
        hashmap.put("Daniel", 95000);
        hashmap.put("Emily", 100000);
        hashmap.put("Bella", 85000);
        //map1.put("Daniel", 80000);
        hashmap.put("Aeron", 78000);
        hashmap.put("Chris", null);
        hashmap.put("Breanna", null);
        hashmap.put(null,120000);
        hashmap.put(null,100000);

        System.out.println("hashmap = " + hashmap);

        System.out.println("---------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();   // insertion order
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        //map1.put("Daniel", 80000);
        linkedHashMap.put("Aeron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,110000);
        linkedHashMap.put(null,100000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("---------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>();  // sorted order, does not accept null key, accept null values

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        //map1.put("Daniel", 80000);
        treeMap.put("Aeron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
        //treeMap.put(null,120000);
        //treeMap.put(null,110000);
        //treeMap.put(null,100000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("---------------------------------------------------------------");

        Map<String, Integer> hashTable = new Hashtable<>();  //random order, does not accept null key, synchronized

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        //map1.put("Daniel", 80000);
        hashTable.put("Aeron", 78000);
        //hashTable.put("Chris", null);   Value in HashTable cannot be null
        //hashTable.put("Breanna", null);
        //hashTable.put(null,120000);
        //hashTable.put(null,110000);
        try{
            hashTable.put("Alvis",100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashTable = " + hashTable);
        


    }
}

/*
Daniel = 95000
Emily = 100000
Bella = 85000

 */
