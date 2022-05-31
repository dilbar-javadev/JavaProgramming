package day17_customClass;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Toyota", "Highlander", 2022, "White", 80000);
        System.out.println(car1);
    }
}
