package randompractices;

import java.util.Scanner;

public class Random05 {
    public static void main(String[] args) {
        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
    */
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        do {
            if (counter == 4) {
                System.out.println("Your Account Has Been Blocked");
                break;
            }
            System.out.println("Input Username");
            String userName = scan.next();

            System.out.println("Input Password");
            String password = scan.next();

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("Welcome Back");
                break;
            }else {
                System.out.println("Please Try Again");
            }counter++;

        } while (true);


    }
}
