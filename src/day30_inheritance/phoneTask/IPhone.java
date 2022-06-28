package day30_inheritance.phoneTask;

public class IPhone extends Phone{

    public static boolean hasApplePay = true;

    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);
    }
}
