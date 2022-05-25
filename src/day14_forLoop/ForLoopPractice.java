package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for(int i=10; i >= 5; i-- ){   //have to make sure that is not an infinite loop

            System.out.println("Hello Cydeo");   // statement get executed first then the iteration will be executed
        }


        System.out.println("---------------------------------------");

        //sum of all the numbers between 1 ~ 100

        //print all the alphabet letters A ~ Z

        //print all the alphabet letters in backwards

        int sum = 0;

        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }

        System.out.println(sum);

        for(char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }

        System.out.println();

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

    }
}
