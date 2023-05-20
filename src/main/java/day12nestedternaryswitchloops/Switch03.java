package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two numbers ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Which Operation. +,-,*,/,% ");
        char opr = scan.next().charAt(0);

        switch (opr) {
            case '+':
                ;
                System.out.println(a + "+"+ b + "=" + (a+b) );
                break;
            case '-':
                ;
                System.out.println(a + "-"+ b + "=" + (a-b) );
                break;
            case '*':
                ;
                System.out.println(a + "*"+ b + "=" + (a*b) );
                break;
            case '/':
                ;
                System.out.println(a + "/"+ b + "=" + (a/b) );
                break;
            case '%':
                ;
                System.out.println(a + "%"+ b + "=" + (a*b/100) );
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
