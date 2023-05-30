package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
     //while
     /*
     baslangic degeri
     while(loop calisma kurali){
     calisacak kodlar
     artirma/azaltma
     }
      */
  //do while
        /*baslangic degeri
        do{
            calisacak kodlar
            artirma/azaltma
            }while(loop calisma kurali)
         */
        //ie1: 5(dahil) den 3 (dahil) e kadar tum tamsayilari consolea yazdiriniz

        int a=5;
        do{
            System.out.println(a);
        a--;
        }while (a>2);
         //1 while-loop

        int i= 1;
        while (i<1){
            System.out.println("Sen bir while loopsun");
            i++;
        }
        // 2 do while loop
        int k=1;
        do {
            System.out.println("Sen bir while loopsun");
            k++;
        }while (k<1);

    }
}
