package Kattis;

import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n,k;
        do{
            n = console.nextInt();
            k = console.nextInt();

        }while(k > n);
        int[] r = new int[k];
        for(int i = 0; i <k; i++){
            do {
                r[i] = console.nextInt();
            }while(r[i] < -3 || r[i] > 3);
        }

        int remJudge = n - k;
        double resultat = 0;
        double resultat2 = 0;

        for (int j : r) {
            resultat += j;
            resultat2 += j;
        }

        resultat += (((-3*remJudge) ));
        resultat = resultat/n;
        resultat2 += (((3*remJudge) ));
        resultat2 = resultat2/n;

        System.out.println(resultat + " " + resultat2);
    }
}
