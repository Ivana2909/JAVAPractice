package domaci4;

import java.util.Scanner;

public class D42b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] niz={1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<niz.length;i++){
            if (i%2==0){
                niz[i] +=2;
            }
            System.out.println(niz[i]);


        }

    }
}

