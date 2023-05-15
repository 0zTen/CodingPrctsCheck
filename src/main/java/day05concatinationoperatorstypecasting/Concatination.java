package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //ie1: Bir string ve iki integer variable olusturun String degeri ile Integerların toplamını consolea yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);
        System.out.println(s +(a+b));
        System.out.println(s + a * b);
        System.out.println();
        //ie2: size string olarak verilen iki fiyatin toplamını ekrana yazdırın
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);

        //Integer.valueOf() string değerleri integera cevirir.
        int toplamFiyat= Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        //ie3: Size string olarak verilen 2 fiyatın toplamını yazınız.
        String tv= "$1100";
        String radio= "$300";
        System.out.println(tv+radio);
        int totalPrice= Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);





    }


}
