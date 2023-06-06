package day20statickeywordconstructors;

public class Car {
    /*
    Constructor nedir?
    Classdan object uretmemize yarayan code blocklaridir.
    Class olustudugumuzda java bize otomatik olarak bir constructor verir. Ama bu constructor gozle gorulmez
    Gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructorlara "default constructor" denir
     "default constructor" "    Car (){ }" seklindedir

     Bir class da farkli parametreler kullanarak istediginiz kadar constructor olusturabililirsiniz
     farkli constructorlar sayesinde bir class dan farkli farkli objectler olusturabilirsiniz.

     1)constructor nasil olusturulur
     Access modifier+ Class ismi+ ()+ {}

     interview sorusu
     2)Method ile Constructor arasindaki farklar nelerdir?
     a)Methodlarda return type olur constructorlarda olmaz
     b)Methodlar yaptiklari ise gore isimlendirilir, Constructorlar her zaman class ismi ile
      c) Method lar bir aksiyon yapmak icin olusturulurlar. Constructorlar ise object olusturmak icindir
        d) Method isimleri kucuk harfle baslar, Constructor isimleri class isimleri ile ayni oldugu icin buyuk harfle baslar
     3)Parametreli Constructorlar olusturarak ayni class dan farkli ozelliklere sahip objectler olusturabiliriz

     */
    String make = "Honda";

    String model = "Accord";

    int year = 2023;

    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;

    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
