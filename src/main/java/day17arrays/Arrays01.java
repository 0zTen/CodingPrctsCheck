package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //kisa yoldan array
        int arr[] = {61, 7, 311, 81, 4};
        System.out.println(Arrays.toString(arr));

        int counter = 0;

        for (int w : arr) {
            if (w % 2 == 0) {
                counter++;
            }
        }
       if (counter>1&&arr.length-counter>1){
           System.out.println("Array Contains " + counter + " Even Numbers " + "And Contains " + (arr.length - counter) + " Odd Numbers ");
       } else if (counter<=1&&arr.length-counter>1) {
           System.out.println("Array Contains " + counter + " Even Number " + "And Contains " + (arr.length - counter) + " Odd Numbers ");
       } else if (counter>1&&arr.length-counter<=1) {
           System.out.println("Array Contains " + counter + " Even Numbers " + "And Contains " + (arr.length - counter) + " Odd Number ");
       }

       //Verilen bir String Arraydeki isimlerden 5 characterden az olani konsola yazdir
        String stdNames[] = {"Ajda","Ayhan","Tom","Cuneyt","Filiz"};
        int count=0;
       for (String w:stdNames){
           if (w.length()<5){
               System.out.println(w);
              count++;
           }

       }
        if (count>=2) {
            System.out.println("There Are " + count + " Names Lesser Than 5 Characters");
        }else {
            System.out.println("There Are " + count + " Name Lesser Than 5 Characters");
        }
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));
        for (String w:stdNames){
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }




    }
}

