package day17_customClass;

public class Rectangle {

    public double length;
    public double width;



    public void setInfo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(double length, double width){

        return length * width;
    }

    public double calculatePerimeter(double length, double width){
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(30,60);

        System.out.println(rectangle1 + "\nArea: "
                + rectangle1.calculateArea(rectangle1.length, rectangle1.width)
                + ", Perimeter: " + rectangle1.calculatePerimeter(rectangle1.length, rectangle1.width));
    }
}
