package domaci7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak {
    //Napraviti dve funkcije:
    //a) Prva funkcija kreira listu od 20 parnih brojeva.
    //b) Druga funkcija uzima listu iz primera a) i eleminise sve brojeve koji su deljivi sa 4

    static void KreirajListu(){
        List<Integer> lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int brojac=0;
        while(brojac<5){
            System.out.println("Unesite element liste: ");
            int n= sc.nextInt();
            if(n%2==0){
                lista.add(n);
                brojac++;
            }else{
                continue;
            }
        }
        System.out.println(lista);
        Eliminisi(lista);
        System.out.println(lista);

    }
    static void Eliminisi(List<Integer> lista){
        for(int i=0;i<lista.size();i++){
            if (lista.get(i)%4==0){
                lista.remove(i);
            }
        }

    }
    public static void main(String[] args){
        KreirajListu();

    }
}
