package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 5; i <9 ; i++) {
         sum = sum + i;
        }
        System.out.println(sum);
        int sum2= 1;
        for (int i = 7; i <10 ; i++) {
            sum2= sum2*i;
        }
        System.out.println(sum2);
        int toplam=0;
        int num= -578;
        num = Math.abs(num);
        for (int i = num; i>0; i=i/10) {
          toplam = toplam+i%10;
        }
        System.out.println(toplam);

   }

}

