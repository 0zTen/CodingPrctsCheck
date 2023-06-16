package day26polymorphism;

public class Student {
    //Encapsulation ==> kapsulleme
    /*
    Encapsulation Nedir? (Data Hiding) veri saklamak
    Data nasil saklanir?
    Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm
    boylece datayi saklarim
    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz? getmethod olusturarak Encapsulate edilmis datanin degerini okuyabiliriz

    1) get methodlar public olur
    2) get methodun return typei okudugu variable in return typei ile ayni olur
    3) get methodun boolean bir variable icin olusturulmus ise get method ismi is ile baslar

    Not : set method kullanarak var olan object uzerinde degisiklikler yaparak o objecti sanki
     yeni bir objectmis gibi kullanabiliriz

    Not 2 : get methodlarin diger adi getter, set methodlarin diger adi setterdir
                getter ve setterlarin ikisine birden "Java Beans" denir
      */
    private String stdId="AC20230614";
    public String stdName ="Ali Can";
    public int age = 23;
    private double notOrt =3.53;
    private boolean succesful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }
/*
Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz?
"set method" olusturarak Encapsulate edilmis datanin degerini degistirebiliriz
 1) set methodlar hep public olur
 2) set methodlarin return typei hep void olur
 3) set methodlar parametre kullanir, parametrenin data typei

 */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
