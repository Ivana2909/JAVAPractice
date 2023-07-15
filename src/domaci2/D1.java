package domaci2;

import java.util.Scanner;

public class D1 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int satnica, brsati, plata;

        System.out.println("Unesite koliko dinara po satu");
        satnica=sc.nextInt();
        System.out.println("Unesite broj radnih sati");
        brsati=sc.nextInt();
        plata = satnica * brsati;
        if (plata>0){
            System.out.println("Satnica je: " + satnica);
            System.out.println("Broj radnih sati je: " + brsati);
            System.out.println("Vasa plata je: " + plata);
        } else{
            System.out.println("Nemate platu za ovaj mesec, jer nemate odradjene radne sate ili niste uneli dobru vrednost za vrednost satnice");
        }

    }
}
