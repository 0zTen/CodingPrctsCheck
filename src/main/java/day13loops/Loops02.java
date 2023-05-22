package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 21; i < 181; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        //ie2: verilen kucuk harfle yazilmis Stringi index i cift sayi olan characterlerini buyuk harfle yazdirin
        //ankara ==> AKR
        String s= "ankara";

        for (int i = 0; i <s.length() ; i++) {
           String ch= s.substring(i,i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }
        //ie3: verilen bir string de ilk a harfinden onceki tum karakterleri consola yazdiriniz
        //"I love Java"
        String s1= "I love Java";
        for (int i = 0; i <s1.length() ; i++) {
            char ch= s1.charAt(i);
            if (ch=='a'){
                break;
            }
                System.out.println(s1.charAt(i));
            }

        //ie4: verilen bir stringde son a dan sonraki tum karakterleri ters sırada yazdiriniz
        //"Germany" ==> yn
        String t = "Germany";
        for (int i= t.length()-1; i>=0 ; i--){
            if (t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }


        }
    }


