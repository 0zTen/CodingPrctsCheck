package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a word");
        String word= scan.nextLine();
        int wordRes= word.replaceAll("[0-9]","").length();
        System.out.println("wordRes = " + wordRes);

        System.out.println("Type a word");
        String word2 = scan.nextLine().toUpperCase();
        int word2L= word2.length();

        String firstLetter = word2.substring(0,1);
        String lastLetter = word2.substring((word2L-1), (word2L));
        String middle = word2.substring(1, word2L-1);

        String newWord = firstLetter.toLowerCase() + middle + lastLetter.toLowerCase();
        System.out.println(newWord);

        System.out.println("Type a word");
        String word3= scan.nextLine();

        if (!word3.isEmpty()){
            char word3First= word3.charAt(0);
            char word3Last = word3.charAt(word3.length()-1);
            int fL = (int) word3First;
            int lL = (int) word3Last;

            System.out.println(fL + lL);
        } else {
            System.out.println("String is empty");
        }
        System.out.println("Type a word");
        String word4 = scan.nextLine();
        String word4F= word4.substring(0,1);
        String word4Rest= word4.substring(1,word4.length());
        String word4Result= word4F.toUpperCase()+word4Rest.toLowerCase();
        System.out.println(word4Result);
        System.out.println("Type password");
        String password = scan.nextLine();
        boolean passwordL= password.length()>=6;
        System.out.println(passwordL);
        boolean passwordUp= password.replaceAll("[^A-Z]","").length()>0;
        System.out.println(passwordUp);
        boolean passwordLow= password.replaceAll("[^a-z]","").length()>0;
        System.out.println(passwordLow);
        boolean passwordInt= password.replaceAll("[^0-9]","").length()>0;
        System.out.println(passwordInt);
        boolean isValid = passwordL&&passwordUp&&passwordLow&&passwordInt;
        System.out.println("isValid = " + isValid);


    }

}
