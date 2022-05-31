package day17_customClass;

public class Address {

    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipCode;

    public void setInfo(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public static void main(String[] args) {

        Address address = new Address();
        address.setInfo(7925, "Jones Branch Dr", "McLean", "Va", 22012);
        System.out.println(address);
        System.out.println(address.buildingNumber + " " + address.street);
        System.out.println(address.city + " " + address.state + ", " + address.zipCode);
    }
}
