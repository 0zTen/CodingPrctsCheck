package day20statickeywordconstructors;

public class CarRunner {
    public static void main(String[] args) {
        //Siz kendi constructorinizi olusturdugunuzda java default constructoru siler
        Car c1 = new Car("BMW", "M4", 2023, false);
        Car c2 = new Car("Audi", "R8", 2022, true);
        Car c3 = new Car("Honda", "Civic", 1999, false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car c4=new Car("Volvo","V40");
        System.out.println(c4);
    }

}
