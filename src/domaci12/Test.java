package domaci12;

import java.util.ArrayList;

public class Test {
    //*
    //    * Napraviti apstraktnu klasu MotornoVozilo koja ima atribute za broj tockova, cenu i godinu proizvodnje.
    //    * Ova klasa ce imati apstraktne metode:
    //      - brojRezervnihGuma -> Metoda koja nam vraca koliko vozilu treba rezervnih guma,
    //      * ako znamo da nam treba jedna guma za svaka dva tocka.
    //      - popust() -> metoda koja daje 50% popusta na Kamion ako je stariji od 20 godina,
    //              30% popusta na Automobil ako je stariji od 5 godina, i 20% popusta na  Motor ako je stariji od 2     godine.
    //      Napraviti Klase Kamion,Motor i Automobil koje nasledjuju klasu MotornoVozilo.
    //      *
    //    * */
    public static void main(String[] args){
        Tocak t=new Tocak(250,true,50000);
        Tocak t1=new Tocak(62,true,6000);
        Tocak t3=new Tocak(115,true,2000);

        ArrayList<Tocak> tockovi=new ArrayList<>();
        tockovi.add(t);
        tockovi.add(t1);
        tockovi.add(t3);
        //for(Tocak u:tockovi) {
        //    System.out.println(u);
        //  }
        Automobil auto=new Automobil(tockovi,6000,1992);
        Kamion k=new Kamion(tockovi,8000,2005);
        Motor m=new Motor(tockovi,6000,1998);
        Kamion k1=new Kamion(130,false,5000,tockovi,6000,1992);

        //System.out.println(auto.brojRezervnihGuma());
        // System.out.println(k1.daLiJeOstecen(t));
        //m.removeOstecenu(tockovi);

        //System.out.println(k);
        //System.out.println(k.daLiJeOstecen(t));
        m.removeOstecenu(tockovi);
        System.out.println(m);
        // k.ubaciRezervnu(tockovi);
        // System.out.println(k);
      //  System.out.println(k.brojRezervnihGuma());
    }
}
