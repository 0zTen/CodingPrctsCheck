package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //ie1: bir strringin belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak alınız
        String a = "abc@gmail.com";
        int startingIndex = a.indexOf('@')+1;
        int endingIndex = a.indexOf(".");
        String companyName= a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);

        //ie2: Verilen 2 stringin birbirinin aynısı olup olmadıgını kontrol eden kodu yazınız
        String h = "ali Can";
        String i = "Ali Can";
        boolean isEqual= h.equals(i);
        System.out.println("isEqual = " + isEqual);
//-------------------------------------------------------------------------------------------------------------------------------
        //Java da Memory kullanimi
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir
        */
        String s = "Tom";
        String t = "Terry";
        String r= new String("Tom");
        System.out.println(s==t);//false cunku adresler ve degerler farklı
        System.out.println(s.equals(t));//false cunku degerler farklı
        System.out.println(s==r);//false cunku degerler ayniyken adresler farkli
        System.out.println(s.equals(r));//true cunku equals sadece degerlere bakar. s v r nin degerleri ayni oldugunda true verir
//------------------------------------------------------------------------------------------------------------------------------
        //ie3 verilen iki stringin birbirinin aynisi olup olmadigini buyuk harf kucuk harfi dikkate almadan kontrol eden kod
        //equalsIgnoreCase()
        String j = "ali Can";
        String k = "Ali Can";
        boolean isEqual2 =j.equalsIgnoreCase(k);
        System.out.println("isEqual2 = " + isEqual2);
    /* Homework
    1) bir string variable olusturun ve rakam olmayan tum karakterlerin sayisini konsola yazdiriniz
    2) bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri buyuk harfle yazdiriniz
    3) bir string variable olusturunuz ve ilk ve son karakterlerin ascii degerleri toplamini konsola yazdiriniz
    4) tek kelimeli bir sehir ismi icin bir string variable olusturun ve sehir isminin ilk harfini buyuk harfle, diger harfleri kucuk yazdirin
    5) asagidaki kurallara gore kullanicinin girdigi passwordu kontrol ediniz
        a) en az 6 karakter olsun
        b) en az bir buyuk harf
        c) en az bir kucuk harf
        d) en az bir rakam
    Note 1: once canli derste cozulen sorulari yapmak
    Note 2: Tum sorulari dynamic kodlarla cozun
    Note 3: Birbirinizin cozumlerini inceleyipo tavsiyede bulunun ya da yardim isteyin



 */

    }
}

