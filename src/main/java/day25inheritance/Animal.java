package day25inheritance;

public class Animal {
//Inheritance ==> Miras alma
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir, Bunun javadaki karsiligi sudur:
    Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin
    bir cogunu kapsiyor, o zaman direkt yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz
    classa child yaparsiniz

     Inheritancein faydalari
     1) Code tekrarlarindan kurtuluruz
     2) Code tamiri (Maintenance) kolay olur
     3) Child classlari daha atomic yapmis oluruz

     ==> Bir classi baska bir classin child classi yapmak icin "extends" keywordu kullanilir.
     ==> Ilk yazilan class child, ikinci yazilan class parent (veya "Super") olur,
     ==> Child class objectleri Parent Classtan method ve variablelari kullanabilirler
     ==> Parent Class objectleri child classtan method ve variablelari kullanamazlar
     ==> Javada bir classin sadece 1 tane parenti olabilir Coklu parenta "Multiple Inheritance" denir
     tekli parent a "Single Inheritance" denir. Java "Multiple Inheritance" i desteklemez, Java single inheritance kullanir
     ==> Apartman seklindeki inheritancea "Multilevel Inheritance" denir
     ==> Object class her classin parentidir. java da object class haric her classin parenti vardir.
        Java da parent i olmayan tek class object classdir
     ==> Javada parenttan childa olan iliskilere Has-a denir, childdan parenta olan iliskilere Is-a denir
     ==> Javada her classin bir tane default constructor i vardir. Bu default constructor classin icinde gorunmez cunku
     constructor "Object Class" icindedir.
     */
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");

    }
}
