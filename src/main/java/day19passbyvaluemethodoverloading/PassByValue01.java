package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
    //Note: Java pass by value sayesinde variablelarin orijinal degerini korur
    int shirtPrice=100;

        System.out.println(discount("student", shirtPrice));
        System.out.println(discount("veteran", shirtPrice));
        System.out.println(discount("senior", shirtPrice));
        System.out.println(shirtPrice);
        shirtPrice=discount("veteran",shirtPrice);
        System.out.println("shirtprice kampanya "+shirtPrice);



    }
    public static int discount(String type, int price){
     switch (type){
         case "student":
             price=price-10;
             break;
         case "veteran":
             price=price-20;
             break;
         case "senior":
             price=price-5;
             break;
         default:
             price=price;
     }
        return price;
    }
/*
    Pass By Value:
    1) Java  "pass by value" kullanir
    2) Yani; java methodlarin orjinal degeri degistirmesine musaade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur. ve o kopyayi method a yollar
        Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16

    Pass by Referance:
    1) Pass by referanceda methoda referance yollanir
    2) Referance adres demektir. Adres yollaninca method adresi kullanarak orijinal degere ulsair ve degistirir.
    Bu yüzden "C#" gibi Pass by Referance kullanan dillerde method variablein orijinal degerini degistirir.


 */




}
