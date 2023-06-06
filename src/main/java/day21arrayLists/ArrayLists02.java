package day21arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki listin esit olabilmesi icin aynji indexte ayni elemanlar olmalidir
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean r1 = names1.equals(names2);
        System.out.println(r1);

        //Ornek: Size verilen iki Integer Listte tamamiyla ayni elemanlarin olup olmadigini kontrol edin
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);

        //Arraylistte bir elemanin ilk gorunumu nasil silinir
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);
        //ArrayListte bir eleman indexi kullanilarak nasil silinir
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder

        //Ornek: Bir Integer List olusturun ve 12 elemani Listden silin

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(5);
        ages.add(54);
        ages.add(52);
        ages.add(55);
        ages.add(12);

        //1.yol
        Integer nonPrimitive = 12;
        ages.remove(nonPrimitive);
        System.out.println(ages);
        //2.Yol
        ages.remove((Integer) 12);
        System.out.println(ages);
        //3.Yol
        ages.remove(Integer.valueOf(12));
        System.out.println(ages);
        //4.Yol
//      ages.remove(ages.indexOf(12));
//      System.out.println(ages);

        //Bir ArrayListeki bir elemanin tum gorunumlerini nasil sileriz
        List<String> citiesToRemove= new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);


    }
}
