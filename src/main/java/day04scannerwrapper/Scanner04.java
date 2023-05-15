package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kk, uk, Alan, Cevre;
        System.out.println("KK?");
        uk = scan.nextDouble();
        System.out.println("Uk?");
        kk = scan.nextDouble();
        Cevre = Cevre(kk, uk);
        System.out.println("Cevre = " + Cevre);
        Alan = Alan(kk, uk);
        System.out.println("Alan = " + Alan);


    }

    public static double Cevre(double kk, double uk){
        double Cevre;
        Cevre = 2*(kk+uk);
        return Cevre;
    }
    public static double Alan(double kk, double uk){
        double Alan;
        Alan = kk*uk;
        return Alan;


    }


}








