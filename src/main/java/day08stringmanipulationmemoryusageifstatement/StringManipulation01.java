package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //ie1: bir stringin hic charater icermedigini (bos string oldugunu) kontrol eden kod
        //1. yol
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? = " + result1);
        //2.yol
        boolean result2 = str.isEmpty();
        System.out.println("Is empty? " + result2);
         String str2 = "   ";
         boolean result3 = str2.replaceAll(" ","").length()== 0;
        System.out.println("Is Blank? = " + result3);
        boolean result4 = str2.isBlank();
        System.out.println("Is Blank? = " + result4);
        //isblank methodu space ve hicbirsey icin true verir
        //isempty methodu sadece hiclik icin true verir
        //ie3 bir stringde a,i,e characterlerinin ilk gorunumlerinin indexleri toplamını ekrana yazdırın
        //"Java is easy to learn
        String strng = "Java is easy to learn";
        int idxA = strng.indexOf('a');
        System.out.println("idxA = " + idxA);
        int idxI = strng.indexOf('i');
        System.out.println("idxI = " + idxI);
        int idxE = strng.indexOf('e');
        System.out.println("idxE = " + idxE);
        System.out.println(+ idxA + idxI + idxE);
        //ie4: bir stringdeki "Java" kelimesinin ilk olarak kacinci indexte kullanıldıgını gosteren kodu yazınız
        // "Ah java vah Java sensiz olmuyor"
        String strn = "Ah Java vah Java sensiz olmuyor Java";
        int idxJava= strn.indexOf("Java");
        System.out.println("idxJava = " + idxJava);
        // bir stringde olmayan karakterin indexi -1 dir
        //ie5:ie3 bir stringde a,i,e characterlerinin son gorunumlerinin indexleri toplamını ekrana yazdırın
        String st = "Java is easy to learn";
        int stLastIdxa= st.lastIndexOf('a');
        int stLastIdxi= st.lastIndexOf('i');
        int stLastIdxe= st.lastIndexOf('e');
        System.out.println(stLastIdxa+stLastIdxi+stLastIdxe);





    }


}
