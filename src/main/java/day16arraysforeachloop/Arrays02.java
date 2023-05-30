package day16arraysforeachloop;

public class Arrays02 {
    public static void main(String[] args) {
        //string array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi karakter sayilari
        //toplamini ekrana yazdirin

        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        int sum = (arr[0].length() + arr[arr.length - 1].length());
        System.out.println(sum);

        //ie2:String bir array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin icerdigi karakter sayilarini
        //ekrana yazdirin

        String amr[] = new String[5];
        amr[0] = "Miami";
        amr[1] = "Istanbul";
        amr[2] = "Ankara";
        amr[3] = "Oslo";
        amr[4] = "Erzurum";
        //1.yol for loop
        int totalChar = 0;
        for (int i = 0; i < amr.length; i++) {
            totalChar = totalChar + amr[i].length();

        }
        System.out.println(totalChar);

        //2.yol for each loop(enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini halleder.
        //for-each-loop "Array"lerde ve collectionlarda kullanilir
        /*for (dataType w:arr/collection){
            calisacak kodlar

         */
        int sum2 = 0;
        for (String w : amr) {
            sum2 = sum2 + w.length();

        }
        System.out.println(sum2);

        //ie3 Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdirin

        int notlar[] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;

        int toplam = 0;
        for (Integer w : notlar) {
            toplam = toplam + w.intValue();
        }
        int ortalama = toplam / notlar.length;
        System.out.println(ortalama);


    }
}

