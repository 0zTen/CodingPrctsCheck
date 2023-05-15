package day05concatinationoperatorstypecasting;

public class TypeCasting {
    public static void main(String[] args) {
        /*

        numeric primitive data typlerinin birbirine dönüşmesine "type casting" denir
        kucuk data typler buyuk data typlelara donusturulebilir. java otomatik yapar
        bu isleme AutoWidening denir

        buyuk data typei kucuk data typea cevirmek risklidir, java otomatik yapmaz
        bu isi kod yazandan bekler
        bu isleme ExplicitNarrowing denir
         */
        byte age = 13;
        int ageInt= age;//AutoWidening

        //int data typeini short data typeina cevirin

        int weight = 312;

        short ShortWeight = (short)weight;// ExplicitNarrowing



    }


}
