package day19passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

        add(3,5);


    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    /*
    1) Method Overloading yaparken isim degistirilmez.
    2) Method Overloading yaparken parametreler degistirilir.
     a)
     b)Parametreleri degistirirken, parametrelerin sayisi degistirilebilir
     c)Parametre degistirirken parametrelerin data typelari farkli ise yerleri degistirilebilir
     3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir
     bu yüzden ismi ve parametre "Method signature" olarak adlandirilir.

     4) Method Overloading olustururken return typei degistirimenin hicbir etkisi yoktur
     Method Overloading olusturu

     */
}
