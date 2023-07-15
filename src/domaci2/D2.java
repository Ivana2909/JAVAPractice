package domaci2;

import java.util.Scanner;

public class D2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite naziv cveta");
        String naziv=sc.nextLine();
        double cR=70;
        double cZ=cR + 20;
        double cO=cZ*2.5;
        double cB=cO*3;

        if (naziv .equals("Ruza")) {
            System.out.println("Imamo Ruzu: " + cR);
       } else if (naziv .equals("Zumbul")) {
            System.out.print("Imamo Zumbul: " + cZ);
        }else if (naziv .equals("Orhideja")){
               System.out.print("Imamo Orhideju: " + cO);
        } else if (naziv .equals("Bonzai")) {
           System.out.print("Imamo Bonzai: " + cB);
        }else{
            System.out.println("Pogresan unos ili nepostojeci cvet na lageru");
        }
    }

}


