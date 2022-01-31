package Kattis;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int[] userInput = new int[2];
        String[] splitInput = input.split(" ");

        for(int i = 0; i < 2 ; i++){
            userInput[i] = Integer.parseInt(splitInput[i]);
        }

        System.out.println(userInput[0]+userInput[1]);

    }

}
