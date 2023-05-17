package day11nestedifternaryincrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Incerement
        int a= 5;
        System.out.println(a);
        a=a+2;
        System.out.println(a);
        a+=2;
        System.out.println(a);
    //ie1: bir integer variablei 2 sekilde 5 artırın
        int b=8;

        b=b+5;
        System.out.println(b);
        b+=5;
        System.out.println(b);

        //decrement
        int c = 6;
        c-=2;
        System.out.println(c);

        //increment2
        int d= 3;
        d*=2;
        System.out.println(d);

        //decrement2
        int e= 6;
        e/=2;
        System.out.println(e);

        //"1"ile increment

        int f=12;
        f-=1;

        int h = 4;
        h-=1;

        //"post-increment" ve "pre-increment"
        int i= 10;
        int k =i++; //post-increment

        System.out.println("i = "+i);
        System.out.println("k = "+k);


        int m= 15;
        int n= ++m; //pre-increment
        System.out.println("m = "+m);
        System.out.println("n = "+n);

        //ie2:
        int p= 17;
        int r= p--;
        System.out.println("p"+p);
        System.out.println("r"+r);
        //ie3:
        int s=20;
        int t= --s;
        System.out.println("s"+s);
        System.out.println("t"+t);



    }
}
