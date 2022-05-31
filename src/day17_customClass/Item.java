package day17_customClass;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item();

        item1.setInfo("Apple", 5, 50);

        System.out.println(item1 + "\nTotal price: " + item1.calcCost());
    }
}
