package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
     /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Input Password");
        String pwd = scan.nextLine();

        if(pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z'){//Pwdnin ilk harfi buyuk harfi ise
            if(pwd.charAt(0)=='A'){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid because Upper case but not A ");
            }
        }else if (pwd.charAt(0)>='a' &&pwd.charAt(0)<='z'){//pwdnin ilk harfi kucuk ise
            if (pwd.charAt(0)=='z'){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid because lower case but not z");
            }

        }else{
            System.out.println("First character must be a letter");
        }




    }
}
