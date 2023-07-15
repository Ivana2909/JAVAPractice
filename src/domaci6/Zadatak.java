package domaci6;

import java.util.Scanner;

public class Zadatak {

    static void Ispis(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println();
    }

    static int[] UbacivanjeEleUNiz(int duzinaNiza) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite " + duzinaNiza + " ele. niza");
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = skener.nextInt();
        }
        return niz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza");
        int n = sc.nextInt();
        int[] niz1 = UbacivanjeEleUNiz(n);
        System.out.println("Elementi niza su:");
        Ispis(niz1);

        System.out.println("Niz pre izmene");
        Ispis(niz1);
        System.out.println("Niz pnakon izmene");
        for (int i = 0; i < niz1.length; i++) {
          if (niz1[i] % 2 != 0) {
              niz1[i] += 1;
          }
       }
        Ispis(niz1);
    }
}
