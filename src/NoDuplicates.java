package Kattis;

import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String sentence = console.nextLine();

        String[] newSentence = sentence.split(" ");
        boolean wrong = false;
        for(String k : newSentence){
            int t = 0;
            if (wrong){
                break;
            }
            for(int i = 0; i < newSentence.length; i++){
                if (k.equals(newSentence[i])){
                    t++;
                }
                if (t >= 2){
                    wrong = true;
                    break;
                }
            }
        }
        if (wrong){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }
    }
}
