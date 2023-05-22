package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //ie1: verilen stringde kucuk harfleri consolea yazmayin
        String t= "Pwd12?Ab";
        for (int i=0; i<t.length(); i++){

            char ch= t.charAt(i);

            if(ch>'a' && ch<'z') {
                continue;
            }else{
                System.out.print(ch);
            }
        }
    /*
    break ile continue arasindaki fark
    break switch in disina cikmak icin ve loopu kirmak icin kullanilir
    continue ise loop yaparken bazi elemanlari isleme sokmamak icin kullanilir
    continue keywordu bir looptaki gecerli iterationi sonlandirip sizi artirma/azaltma bolumune goturur.
     */


    }
}
