package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //ie1: kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scan.nextInt();
        //1.yol
        if (number % 2 == 0) {
            System.out.println("Your number is even");
        }
        if (number % 2 != 0) {
            System.out.println("Your number is odd");
        }

        if(number%2 ==0){
            System.out.println("Your number is even");

        }else{
            System.out.println("Your number is odd");
    }


    }




    }

