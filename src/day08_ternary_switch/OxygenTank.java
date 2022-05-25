package day08_ternary_switch;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 80;
        String message = "";
        switch(level){

            case 90:
                message = "Your tank is full";
                break;
            case 80:
                message = "Still Okay";
                break;
            case 70:
                message = "Don't go too far";
                break;
            case 60:
                message = "Start to head back";
                break;
            case 50:
                message = "Be careful now you at at 50%";
                break;
        }

        System.out.println(message);

    }
}
