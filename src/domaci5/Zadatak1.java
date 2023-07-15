package domaci5;

import java.util.Scanner;

public class Zadatak1 {

    static int BrPonavljanjaEleUNizu(String[] niz, String ime) {
        int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            if (ime.equalsIgnoreCase(niz[i])) {
                sum += 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[] niz = {"Nemanja", "Jovana", "Maja", "Jovana", "Maja",
                "Vladimir", "Vladimir", "Saska", "Nemanja", "Jovana"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neko ime");
        String ime = sc.nextLine();
        int brpon = BrPonavljanjaEleUNizu(niz, ime);
        int sum = 0;

        for (int i = 0; i < niz.length; i++) {
            if (ime.equalsIgnoreCase(niz[i])) {
                sum += 1;
            }
        }

        if (sum == 0) {
            System.out.println("Uneto ime ne postoji u nizu");
        } else {
            System.out.println("Uneto ime postoji u nizu");
            System.out.println("Uneto ime se ponavlja " + brpon + " puta u nizu");
        }

    }
}
