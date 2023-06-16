package day23datetimevarargs;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);
        int myCurrentHour = myCurrentTime.getHour();
        System.out.println(myCurrentHour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        //Gelecek veya gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);
        //Zaman Formati nasil degistirilir?
        /*
        DateTime classda kullanilan tarih saat formatlari
        HH : mm==> 24lu saat sistemi
        hh : mm ==> 12 li saat sistemi
        hh : mm a ==> 12 li saat sistemi AM,PM gosterilir
        HH : mm : ss ==> 24 lu saat sistemi, saniye dahil
        HH : MM ==> yanlis format, MM month icin kullanilir
        "mm" minute demektir

        dd-MM-yyyy ==> gun ay yil
        MMM ==> Aug
        MMMM ==> August
         */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");

        String newTime = dtf1.format(myCurrentTime);
        System.out.println(newTime);
        LocalDate myCurrentDate = LocalDate.of(2023, 8, 13);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String newDate = dtf2.format(myCurrentDate);
        System.out.println(newDate);
        // tarihi gun ve ay isminin ilk 3 harfi /yıl
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy,EEE", new Locale("ru", "RU"));//(Ru)
        String fdNewDate = dtf3.format(myCurrentDate);
        System.out.println(fdNewDate);
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEE-MMMM-yyyy,dd", Locale.ENGLISH);//english
        String fdNewDate2 = dtf4.format(myCurrentDate);
        System.out.println(fdNewDate2);

        //Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdamda ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        LocalDate dateInPhoenix = LocalDate.now(ZoneId.of("America/Phoenix"));
        System.out.println(dateInPhoenix);

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        String newTimeBerlin = dtf5.format(timeInBerlin);
        System.out.println(newTimeBerlin);

    }
}
