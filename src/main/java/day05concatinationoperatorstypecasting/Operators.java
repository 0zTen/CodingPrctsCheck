package day05concatinationoperatorstypecasting;

public class Operators {
 /*
 javada "logical operatorler" vardır. and ve or işlemleri logical operatordür.

        1)And (&&) işleminde true alabilmek için her şey true olmalıdır
        and islemi perfectionisttir.

        2)or isleminde || bir tane true sonucu true yapmaya yeter
        false icin her şey false olmalıdır

        3)NOT operator (!) true olanı false, false olanı true yapar
        !true = false
        !false = true
        !!true= true
        4) comparison operators
        <,>,<=,>=,==,!
        comparison operatorlarda her zaman boolean kullanılır
*/
 public static void main(String[] args) {
     boolean isFirst = 3<5;
     boolean isSecond = 2+3 != 5;
     boolean isThird = 2+3*5>= 19;

     System.out.println(isFirst+ " - " +isSecond + " - " + isThird);

     System.out.println(isFirst && isSecond);
     System.out.println(isFirst||isSecond||isThird);



 }



    }







