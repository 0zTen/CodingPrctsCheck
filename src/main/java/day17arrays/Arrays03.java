package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
      //spesifik bir elemanin arrayde olup olmadigini anlamak icin gereken kodu yaziniz
        String names[]= {"K","C","R","A","S"};
        String el="R";

        //1.yol
        int counter=0;
        for (String w:names) {
            if (w.equals(el)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has "+ el);
        }else{
            System.out.println("Array does not have "+el);
        }
        //2.yol Binary Search
        /*

         */
        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);

        if (result<0){
            System.out.println("Array does not have "+el);
        }else{
            System.out.println("Array has "+ el);
        }
        int num1=Arrays.binarySearch(names,"A");
        System.out.println(num1);


    }
}
