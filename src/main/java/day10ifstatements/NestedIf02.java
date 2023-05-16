package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input lenght for sides");
        double sideA = scan.nextDouble();
        double sideB = scan.nextDouble();
        double sideC = scan.nextDouble();

        boolean IsTriangle = sideA + sideB > sideC && sideC > Math.abs(sideA - sideB) &&
                sideA + sideC > sideB && sideB > Math.abs(sideA - sideC) &&
                sideB + sideC > sideA && sideA > Math.abs(sideB - sideC);

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Input Valid Side Length");
        } else if (IsTriangle) {

            if (sideA == sideB && sideB == sideC && sideA == sideC) {
                System.out.println("Equilateral Triangle");
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }else {
            System.out.println("It is Not a Triangle");
        }

    }
}

