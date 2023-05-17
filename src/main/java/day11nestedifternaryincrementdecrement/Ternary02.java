package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //ie1
        int a = 10;
        int b = 20;

        int r1 = a > b ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);
        //ie2 verilen bir sayinin mutlak degerini hesaplayan kod
        int c = 4;
        int r2 = c < 0 ? -1 * c : c;
        System.out.println(r2);
        //ie3: iki sayinin isareti ayni ise bu sayilari carpan isaretleri farkli ise "farkli isaretleri carpamiyorum yaziniz
        int m = 5;
        int n = -6;
        Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "farkli sayilari carpamiyorum";
        System.out.println(r3);

        //ie4: verilen sayi 3 basamakli mi?
        int p = 20;
        String x= p>99 && p<1000 ? "uc basamaklidir" : "uc basamakli degildir";
        System.out.println(x);



    }
}
