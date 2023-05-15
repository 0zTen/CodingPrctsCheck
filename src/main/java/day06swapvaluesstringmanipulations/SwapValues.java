package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //swap: yer değiştirmek 1.kap patates 2.kap domates = swap= 1.kap domates 2.kap patates

        int a=12;
        int b=5; //swapten sonra a=5 b=12 boş kap =temp
        int temp=0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //1.adım
        temp = a;
        //2.adım
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //2.yol
        int c= 12;
        int d= 5;
        c= c+d;
        d= c-d;
        c= c-d;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }


}
