package day42_maps.tasks;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task6 {

    public static void main(String[] args) {

        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<Integer, Map<String, Object>> myCars = new LinkedHashMap<>();
        myCars.put(1,car1);
        myCars.put(2,car2);
        myCars.put(3,car3);

        for (Map.Entry<Integer, Map<String, Object>> eachCar : myCars.entrySet()) {
            System.out.println(eachCar.getValue().get("brand") + " - " + eachCar.getValue().get("model") + " - " + eachCar.getValue().get("price"));
        }

        System.out.println("------------------------------");

        for (Map.Entry<Integer, Map<String, Object>> eachCar : myCars.entrySet()) {
            if(eachCar.getValue().get("electric").equals(true)){
                System.out.println(eachCar);
            }
        }

        System.out.println("------------------------------");

        int mostExpensive = 0;
        String car = "";
        for (Map.Entry<Integer, Map<String, Object>> eachCar : myCars.entrySet()) {
            if((Integer)eachCar.getValue().get("price") > mostExpensive){
                mostExpensive = (Integer)eachCar.getValue().get("price");
                car = eachCar.getValue().get("brand").toString();
            }
        }

        System.out.println(car + " " + mostExpensive);

    }
}
