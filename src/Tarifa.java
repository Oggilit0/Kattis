package Kattis;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int X,N;

        do {
            X = console.nextInt();
        }while(X < 1 || X > 100);

        do {
            N = console.nextInt();
        }while(N < 1 || N > 100);

        int[] P = new int[N];

        for(int i = 0; i < N ; i++){
            P[i] = console.nextInt();
        }

        int sum = 0;

        for(int i : P){
            sum += i;
        }

        System.out.println(((N*X)+X)-sum);

    }
}
