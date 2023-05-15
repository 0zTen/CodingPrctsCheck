package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //Wrapper  class: :
        //primitive     : char      - boolean - byte - short - int   - long - float -double
        //Wrapper Class : Character - Boolean - Byte - Short -Integer- Long - Float -Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        // m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;

        //Ornek : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //i.e2: int data typeinin minimum değeri ile byte data değerinin max değeri
        int intMin =Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);
        //ie3: primitive inti wrapper inte çeviriniz. = autoboxing
        int num = 12;
        Integer wrapperNum = num;
        //ie4: wrapper Bytei primitive byte a çevirin. = unboxing
        Byte k =12;
        byte primitiveK = k;
        //ie5: primitive chari Wrapper Charactere çevirin.
        char initial = 'k';
        Character wrapperK =initial;
        //ie6: Wrapper Booleani primitive booleana cevirin.
        Boolean isOldWrapper = true;
        boolean isPrimitive = isOldWrapper;


    }


}
