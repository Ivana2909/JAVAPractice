package domaci11;

import domaci4.Proba;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Sportista> sportisti = new ArrayList<Sportista>();
        Sportista Ivana=new Sportista("Ivana",1,50000);
        Sportista Aleksandar=new Sportista("Aleksandar",2,20000);
              sportisti.add(Ivana);
              sportisti.add(Aleksandar);

        Spartak s=new Spartak(sportisti,"BG",20000);
        System.out.println(s.Isplata());
        System.out.println(s.ProsecnoPlaceni());
        System.out.println(s.toString());
        s.removePreplaceni(sportisti);
        System.out.println(sportisti);
              }
    }

