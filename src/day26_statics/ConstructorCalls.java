package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){

        //this();   // constructor cannot call itself
        System.out.println("Default constructors");
    }

    public ConstructorCalls(int a){
        this();    //  if call "this" with "()", it is calling the constructors in another constructor, if with "." means trying to call instance variables or instance methods
        // constructor call has to be in the *first step*
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(2.5);
       // this();  // one constructor cannot call more than one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        methods1();

        System.out.println("-----------------------");

        methods2();
    }
    public static void methods1(){
        System.out.println("method 1");
    }
    public static void methods2(){

        methods1();

        System.out.println("method 2");
    }


}
