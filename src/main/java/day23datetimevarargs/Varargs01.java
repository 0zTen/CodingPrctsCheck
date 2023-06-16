package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(2, 3, 4,6,10,15,190));


    }
    //Note1) Bir method parantezinde birden fazla Varargs kullanilamaz
    //Note2) Eger bir method parantezinde birden fazla parametre kullanilacaksa Varargs sonda olmalidir
    public static int add(int... a){
       int sum=0;
        for (int w: a) {
            sum=sum+w;
        }
    return sum;
    }
    //Asagidaki gibifarkli methodlar olusturarak is yapamayiz
    //Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir
    //Her ihtimal icin bir method olusturmak mumkun degildir
    //java farkli sayida parametrelerin hepsini kabul eden bir yapi olusturdu
    //bu yapiya Varargs denir
    //Varargs arkada Array yapisini kullanir
     /*   public static int add(int a, int b, int c){
        return a+b+c;

    }
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
     */
}
