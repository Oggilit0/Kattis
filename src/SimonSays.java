package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n =0;
        String input;
        boolean bool = false;
        do {
            try {
                console = new Scanner(System.in);
                do {
                    input = console.nextLine();
                    n = Integer.parseInt(input);

                } while ( n > 1000 || n < 1);
                bool = true;
            }
            catch(Exception e){
                bool = false;
            }
        } while(bool == false);

        String[] simonSays = new String[n];
        String temp = "";
        String simon = "Simon says";
        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0; i<n; i++){

            do {
                input = console.nextLine();
            }while(input.length() > 100);

            simonSays[i] = input;
            if (input.length() > 10){
                for (int u = 0 ; u<10;u++ ){
                    temp += simonSays[i].charAt(u);
                }
                if (simon.equalsIgnoreCase(temp)){
                    count.add(i);
                    temp = "";
                }else{
                    temp = "";
                }
            }
        }
        for (int e : count){
            System.out.println(simonSays[e].substring(11));
        }
    }
}
