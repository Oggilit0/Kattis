package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectricalOutlets {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N;

        do{
            N = Integer.parseInt(console.nextLine());
        }while(N <= 0 || N > 20);


        int[] answers = new int[N];

        for(int i = 0; i < N ; i++){
            int length;
            String[] test;

            String userInput;
            do{
                userInput = console.nextLine();

                if(userInput.charAt(2) != ' '){
                    length = Integer.parseInt(""+userInput.substring(0,1));
                    userInput = userInput.substring(2);   // user input = 3 2 3 4

                }else{
                    length = Integer.parseInt(""+userInput.substring(0,2));
                    userInput = userInput.substring(3);
                }

                test = userInput.split(" ");

            }while(test.length < length);
                answers[i] = 0;
            for(String string : test){
                answers[i] += Integer.parseInt(string);
            }
            answers[i] = answers[i] - (length-1);
        }


        for(int i : answers){
            System.out.println(i);
        }

    }
}
