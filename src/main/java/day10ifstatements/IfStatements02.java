package day10ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //ie gun sayisi verdiginizde gun ismini yazan kodu giriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Which Day?");
        byte dayNum= scan.nextByte();

        if (dayNum==1){
            System.out.println("Sunday");
        }else if (dayNum==2){
            System.out.println("Monday");
        }else if (dayNum==3){
            System.out.println("Tuesday");
        }else if (dayNum==4){
            System.out.println("Wednesday");
        }else if (dayNum==5){
            System.out.println("Thursday");
        }else if (dayNum==6){
            System.out.println("Friday");
        }else if (dayNum==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Please input a day number");
        }

        //Boundary Value Analysis BVA








    }
}
