package domaci4;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nesto = ("");
        String sum = ("");
        System.out.println("Unesite String: ");
        while (!nesto.equalsIgnoreCase("Stop")) {
            nesto = sc.nextLine();
            if(nesto.equalsIgnoreCase("Stop")){
                break;
            }
            sum += nesto + " ";
        }

        System.out.println(sum);

    }
}





