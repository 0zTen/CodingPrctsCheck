package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        LocalDate myCurrentDate= LocalDate.now();
        System.out.println(myCurrentDate);

        int monthValue=myCurrentDate.getMonthValue();
        System.out.println(monthValue);

        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);

        int dayValue=myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        //Month bir enumdir
        //enum javada sabit degerleri (Ay isimleri, gun isimleri, ulkedeki sehir isimleri) depolamak icin kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek dayName=myCurrentDate.getDayOfWeek();
        System.out.println(dayName);


        System.out.println(myCurrentDate.plusDays(5).plusMonths(5).plusYears(5));

        System.out.println(myCurrentDate.minusYears(5));

        LocalDate date1=LocalDate.of(1980,8,10);

        LocalDate date2=LocalDate.of(1990,8,10);

        boolean isAfter=date1.isAfter(date2);
        System.out.println(isAfter);

        //bir tarihin bir tarihe esit olup olmadigini nasil kontrol ederiz

        boolean isEqual=date1.isEqual(date2);
        System.out.println(isEqual);
        //ie: Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        // Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in the given order");
        int year=scan.nextInt();
        int month=scan.nextInt();
        int day=scan.nextInt();

       LocalDate givenDate=LocalDate.of(year,month,day);
        if (LocalDate.now().isAfter(givenDate)){
            System.out.println(givenDate+" Invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }


    }
}
