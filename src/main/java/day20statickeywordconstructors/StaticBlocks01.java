package day20statickeywordconstructors;

public class StaticBlocks01 {


    //Bir variable olusturdugunuzda deger atamazsaniz o variablei initialize etmediniz demektir

    //Bazen main method calistirilmadan once variablelarin hazirlanmasi gerekir
    //o yuzden static blocklar kullanilir
    //static variablelar static blocklar icinde initialize edilirse o classin icinde her seyden once calisir
    static double pi;
    static String shape;
    static {
        pi=3.14;
        System.out.println("static block 1");
    }
    static {
        shape="Circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
}
}