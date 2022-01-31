package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String input;
        int score =0;
        String winner = "";

        for(int i = 0; i < 5; i++){
            input = console.nextLine();
            String[] row = input.split(" ");
            int tempScore =0;
            for(int u = 0 ; u <4 ; u++){
                tempScore += Integer.parseInt(row[u]);
            }
            if (tempScore > score ){
                score = tempScore;
                winner = ""+(i+1);
            }
        }
        System.out.println(winner + " " + score);
    }
}
