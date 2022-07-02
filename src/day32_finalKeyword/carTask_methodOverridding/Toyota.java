package day32_finalKeyword.carTask_methodOverridding;

public class Toyota extends Car {


    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }
}
