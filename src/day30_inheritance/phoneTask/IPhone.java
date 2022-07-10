package day30_inheritance.phoneTask;

public class IPhone extends Phone{

    public static boolean hasApplePay = true;

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);
    }
}
