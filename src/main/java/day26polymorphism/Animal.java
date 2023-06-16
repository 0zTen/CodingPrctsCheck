package day26polymorphism;

public class Animal {
/*
1)Parent Classdaki methodu child class icinde ozellestirerek kullanmaya overriding denir
2)Overridingde method signature a dokunulmaz (method signature = method ismi+ parantez)
3)private methodlar override edilemez
4)child classdaki methodun access modifieri parent classdaki override edilmis(Overriden Method)un
5)Child class da override edilen methodun return type i ile parent taki methodun return type i arasinda IS-A iliskisi
  varsa return type degisitirilebilir
6)Methodun return type i primitive ise overriding yaraken return type degistirilimez. Cunku return type ya ayni olur veya
  parent tan secilir, ama primitive ler arasinda parent child iliskisi olmadiginidan parent tan secmek sozkonusu olamaz
7)Child da override edilen methodun return typei ile parenttaki methodun return typi arasinda IS-A iliskisi
    yoksa return type degisitirilemez.
    Mesela;
    Integer wrapper class ile Long wrapper class arasinda IS-A iliskisi YOKTUR. o yuzden degistirilemez
8) Methodun return type i void ise, Overriding yaparken return type degistirilemez.
 9) "static" methodlar override edilemezler. Cunku static methodlar tum child lar icin ortak methodlardir.
    mesela bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu nedenle java
    static methodlarin override edilmesine izin vermez.
    10) final methodlar override edilemezler
        a) Final keywordunu variable larda kullanabilirsiniz
            i) final variable a mutlaka deger atanmalidir
            ii) ilk atanan deger degistirilemez
        b) Final keywordunu method larda kullanabilirsiniz
             i) final methodun bodysi degistirilmez
            ii) method bodysi degistirilemeyince override yapmak mumkun olmaz
        c) Final keywordunu class larda kullanabilirsiniz
            i) class final ise o classin childi olamaz

       Polymorphism = Method overloading + method overriding
 */

    public void eat() {
        System.out.println("Animals eat");
    }

    public void drink() {
        System.out.println("Animals drink");
    }

    public Animal create() {
        return new Animal();

    }
    public final double circleArea(double r){
        return 3.14*r*r;
    }
}
