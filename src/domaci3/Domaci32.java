package domaci3;

import java.util.Scanner;

public class Domaci32 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Firma ima din:");
        double stanje = sc.nextDouble();

        System.out.println("Broj zaposlenih u firmi:");
        int brojRadnika = sc.nextInt();

        int isplata =0;
        double preostaoNovac = 0;

        for(int i = 0; i<brojRadnika; i++){
            isplata = brojRadnika*100;
            preostaoNovac = stanje-isplata;
        }

            if(preostaoNovac<0){
                System.out.println("Nedovoljno para u budzetu firme da se isplate sve plate");
            }else{
                System.out.println(" Preostao novac u firmi je: " + preostaoNovac);

            }

    }
}
