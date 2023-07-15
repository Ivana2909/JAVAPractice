package domaci4;

import java.util.Scanner;

public class D41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pozitivan broj N: ");
        int N = sc.nextInt();
        if( N<0) {
            System.out.println("Uneli ste negativan broj ");
        }

        for (int i = 1; i < N; i++) {
            if(i % 3 != 0 && i % 5 != 0) {
                System.out.println(i + ".");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i +".FizzBuzz");
            }else if(i % 5==0){
                System.out.println(i + ".Buzz");
            }else if(i%3==0){
                System.out.println(i + ".Fizz");
            }
            }



        }
    }
