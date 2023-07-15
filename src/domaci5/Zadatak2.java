package domaci5;

public class Zadatak2 {

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3};
        int[] niz2 = {1, 2, 3};

        int[] niz3 = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            niz3[i] = niz1[i] + niz2[i];
        }
        System.out.println("Novonastali niz je:");
        for (int i = 0; i < niz3.length; i++) {
            System.out.print(niz3[i] + " ");
        }


    }
}
