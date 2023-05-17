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

        char firstChar=pwd.charAt(0);

        if(firstChar>='A'&& firstChar<='Z'){//Pwdnin ilk harfi buyuk harfi ise
            if(firstChar=='A'){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid because Upper case but not A ");
            }
        }else if (firstChar>='a' &&firstChar<='z'){//pwdnin ilk harfi kucuk ise
            if (firstChar=='z'){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid because lower case but not z");
            }

        }else{
            System.out.println("First character must be a letter");
        }




    }
}
