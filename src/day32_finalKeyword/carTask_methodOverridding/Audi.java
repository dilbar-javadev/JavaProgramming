package day32_finalKeyword.carTask_methodOverridding;

public class Audi extends Car {


    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button" + getMake() + " " + getModel());
    }
}
