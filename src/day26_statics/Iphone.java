package day26_statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public String color;
    public double price;

    public static String OS = "iOS";

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
    public static void printPhoneInfo(){   // static only accept static
      //  System.out.println("Model :" + model);
    }

    */

    public void printPhoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }

}


/*
Attributes:
    brand. model, color, price, OS, madeIn
 */