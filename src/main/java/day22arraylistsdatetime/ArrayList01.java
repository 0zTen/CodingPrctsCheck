package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //ie1: bir listteki tekrarsiz elemanlari consolea yazdiran kod

        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(512);
        nums.add(54);
        nums.add(56);
        nums.add(55);
        nums.add(5);

        for (int w: nums ){
            if (nums.indexOf(w)==nums.lastIndexOf(w)){
                System.out.println(w);
            }
        }
        //ie2: bir listte tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Integer> heights=List.of(3,13,23);
       int counter=0;
        for (Integer w:heights) {
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique");
        }





    }
}
