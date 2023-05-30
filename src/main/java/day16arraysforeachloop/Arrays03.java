package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        int ages []=new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        //1.yol sort methodu
        Arrays.sort(ages);
        int sum=0;
        for (int w:ages){
           sum= ages[0] + ages[ages.length - 1];
        }
        System.out.println(sum);
        //2.yol
        int minimum= ages[0];
        int maximum= ages[0];
        int sum2=0;
        for (int w:ages){
           sum2 =Math.min(minimum,w)+Math.max(maximum,w);
        }
        System.out.println(sum2);
        //ie2 string bir array olusturup 6 eleman ekleyin, yellowdan önceki elemanlari yazdirin
        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        for (String w:colors){
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }




    }
}
