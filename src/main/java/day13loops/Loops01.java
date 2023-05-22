package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        //ie1: ekrana 5 kere "Hi" yazdirin
    /*
    Code Standarts
    1) tekrar (repetition) olmamali
    2) kodlar her zaman dinamik olmali
    3) tamir ve update kolay olmali
     */
        //Ayni adimlar tekrar yapilmasi gerektiginde loop lar kullanilir
        // 4 tane loop vardir 1)for loop, 2)while loop 3)do-while-loop 4)for-each-loop
        //1 for-loop
     /*for (baslangic degeri ;loop calisma sarti  ;artirma /eksiltme ){
     } */
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }
        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }
        //ie3: 40 dan 23 kadar tum cift sayilari yazdir
        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i+" ");
            }
        }
        //ie4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiriniz
        for (int i=18; i<57; i++){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }

    }
}
