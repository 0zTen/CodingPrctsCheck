package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //ie1: sayi10dan kucuk ise consolea kucuk yazdirin, degilk ise kucuk degil yazdirin
        //if else cozumu
        int num =12;
        if (num<10){
            System.out.println("Kucuk");
        }else{
            System.out.println("Kucuk degil");
        }
        //ternary cozumu condition     ?   condition true ise calisir         : condition false ise calisir ;
        String sonuc=    num<10        ?          "Kucuk"                     : "Kucuk Degil"               ;

        System.out.println(sonuc);

        //ie2: sayi cift ise consolea cift yazdirin, tek ise consolea tek yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number");
        int number = scan.nextInt();
        System.out.println("Input Number2");
        int number2= scan.nextInt();
        System.out.println("Input Number3");
        int number3= scan.nextInt();
        //if else
        if (number%2 ==0){
            System.out.println("cift");
        }else{
            System.out.println("Tek");
        }
        //ternary
        String ciftMi = number%2==0  ? "cift"  : "Tek";
        System.out.println(ciftMi);

        //ie3: sayi 0dan buyukse pozitif, degilse pozitif degil yazdirin
        String result2= number>0 ? "pozitif" : "pozitif degil";
        System.out.println(result2);

        //ie4 kullanicidan 2 sayi alip buyuk olmayan sayiyi yazdiriniz
        //if else yolu
        if(number2<number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }
        //ternary yolu
        int result3= number2<number3 ? number2 : number3;
        System.out.println(result3);



    }
}
