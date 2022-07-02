package day32_finalKeyword.carTask_methodOverridding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car {


    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void setModel(String model) {
        if(!(model.equals("Model S") || model.equals("Model Y") || model.equals("Model x") || model.equals("Model 3"))){
            System.err.println("Invalid model");
            System.exit(1);
        }
        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        String[] colors = {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"};
        if(!Arrays.asList(colors).contains(color)){
            System.err.println("Invalid color");
            System.exit(1);
        }
        super.setColor(color);
    }

    @Override
    public void setYear(int year) {
        if(year < 2008){
            System.err.println("Year cannot be less than 2008");
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if(price < 50000){
            System.err.println("Price cannot be less than 50k");
            System.exit(1);
        }
        super.setPrice(price);
    }

    public final void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has auto pilot function");
    }

    @Override
    public void start() {
        System.out.println("\"Say \\\"Start\\\"\"");
    }
}
