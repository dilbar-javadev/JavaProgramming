package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

   //     new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("---------------------------------------");

        System.out.println(AccessModifiers.publicData);   // public is accessible within same package

        System.out.println(AccessModifiers.protectedData);   //  public is NOT always accessible in different packages

        System.out.println(AccessModifiers.defaultData);  //   default is accessible within same class

        //System.out.println(AccessModifiers.privateData);   //   private is NEVER accessible within same class

    }
}
