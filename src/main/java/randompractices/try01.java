package randompractices;

import java.util.Scanner;

public class try01 {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       int counter = 0;
       String trueUserName= "admin";
       String truePassword= "pwd123";
        do {
            if (counter==4){
                System.out.println("Your Account Has Been Blocked");
                break;
            }
            System.out.println("Input Username");
            String userName= scan.next();
            System.out.println("Input Password");
            String password= scan.next();
            if (userName.equals(trueUserName)&&password.equals(truePassword)){
                System.out.println("Welcome Back");
                break;
            }else{
                System.out.println("Please Try Again");
            }

        counter++;
        }while (true);




    }
}
