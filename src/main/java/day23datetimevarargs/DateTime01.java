package day23datetimevarargs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //ie1: kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz
        // kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year,month,and day numbers in the given order");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println(givenDate + " Invalid Date");
        } else {
            System.out.println("Enter time for ticket");
        }
        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter date as year,month,day");

        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        LocalDate date = LocalDate.of(y, m, d);
        DayOfWeek givenDateDay = date.getDayOfWeek();
        System.out.println(givenDateDay);


    }
}
