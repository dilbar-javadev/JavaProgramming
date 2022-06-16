package day24_dateAndTime;

import javax.security.auth.callback.LanguageCallback;
import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1992,7,18);

        System.out.println(birthday);

        System.out.println("---------------------------------------------");

        System.out.println(today.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(birthday.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("----------------------------------------------");


        today = today.plusYears(1);

        System.out.println(today);


        System.out.println("----------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);


        System.out.println("----------------------------------------------");


        LocalDate yourBirthday = LocalDate.of(1993, 2,9);

        LocalDate yourBrotherBirthday = yourBirthday.minusYears(6).minusMonths(7).minusDays(5);

        System.out.println("yourBirthday = " + yourBirthday);
        System.out.println("yourBrotherBirthday = " + yourBrotherBirthday);

        System.out.println("----------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1995, 6,7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);


        System.out.println("----------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));


        System.out.println("----------------------------------------------");

        System.out.println(LocalDate.of(2022,6,16).isLeapYear());

        System.out.println("----------------------------------------------");

        birthday(1993,2,9);


    }

    public static void birthday(int year, int month, int day){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        if(today.getMonthValue() == month && today.getDayOfMonth() == day){
            System.out.println("Happy Birthday!");
            System.out.println("You are " + (today.getYear() - birthday.getYear()) + " years old");
        }else{
            System.out.println("Today is not your birthday.");
        }
    }
}
