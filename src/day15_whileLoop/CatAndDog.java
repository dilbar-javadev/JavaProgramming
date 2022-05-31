package day15_whileLoop;

public class CatAndDog {

    public static void main(String[] args) {

        String sentence = "caT dog doG cAt";
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < sentence.length()-2; i++) {
            if(sentence.toLowerCase().substring(i,i+3).equals("cat")){
                cat += 1;
            }else if(sentence.toLowerCase().substring(i,i+3).equals("dog")){
                dog += 1;
            }
        }
        boolean result = (cat == dog)? true : false;
        System.out.println(result);
    }
}

/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

            Ex:
                sentence = "caT dog doG cAt"

                output:
                    true
 */
