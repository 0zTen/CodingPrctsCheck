package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
        */
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner scan = new Scanner(System.in);
        int counter=0;
        int life=3;
        do {
            if(counter==3){
                break;
            }

            System.out.println("Please enter a letter");
            String letter = scan.next().toUpperCase().substring(0, 1);

            if (myList.contains(letter)){
                myList.set(myList.indexOf(letter),"Found it!");

            }else{
                myList.add(letter);
            }
            System.out.println(myList);
            counter++;
        }while(counter<3);
    }
}
