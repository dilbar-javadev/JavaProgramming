package day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudent{

    public final void language(){
        System.out.println("Java Programming");
    }

}

public class FinalKeyword extends CydeoStudent{

    /*
    final method can never be overridden
     */

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);

        LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        new CydeoStudent().language();
        new FinalKeyword().language();


    }
}
