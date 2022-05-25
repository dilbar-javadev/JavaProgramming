package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num = -88;

        String result = "";

        if(num > 0){
            result = "Positive";
        }else if(num == 0){
            result = "Zero";
        }else{
            result = "Negative";
        }

        System.out.println(result);
    }
}
