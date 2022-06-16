package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime startingTime = LocalTime.of(10,30);

        System.out.println(startingTime);

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now);

        System.out.println("---------------------------------------------");

        LocalTime time1 = LocalTime.of(23,59,59);
        System.out.println(time1);

        time1 = time1.plusHours(1);

        System.out.println(time1);

        time1 = time1.plusMinutes(1);

        System.out.println(time1);
    }
}
