package day20statickeywordconstructors;



public class StdRunner {
    public static void main(String[] args) {
       //stdName static olduggundan ona ulasmak icin object olusturmadan sadece class ismi kullanmak yeter

        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmaliyiz
        Student std1=new Student();//constructor
        System.out.println(std1.age);

        Student.staticMethod();

        std1.nonStaticMethod();



    }

}
