package domaci9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Departman d=new Departman("biologija", 3, 2);
        Departman d1=new Departman("srpski",1,3);

        Fakultet f=new Fakultet("FON",d,new Departman("hemija", 3, 6), new Departman("biologija",2,6));

        System.out.println(f.ukuBrUcenika());
        f.dodajStrucne();
        System.out.println(f.dodajStrucne());
    }
}
