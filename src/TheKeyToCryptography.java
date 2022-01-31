package Kattis;

import java.util.Scanner;

public class TheKeyToCryptography {
    public static void main(String[] args) {
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        Scanner console = new Scanner(System.in);
        String input;
        String key;
        do{
             input = console.nextLine();
        }while(input.length() < 1 || input.length() > 500);

        String[] inputSplit = input.split("");

        do{
            key = console.nextLine();
        }while(key.length() < 1 || key.length() > 500);
        String[] keySplit = key.split("");

        int[] keyValue = new int[input.length()+key.length()];
        int[] inputValue = new int[input.length()];

        for(int u = 0; u < keySplit.length; u++){

            for(int i = 0 ; i < alphabet.length; i++){
                if(keySplit[u].equals(alphabet[i])){
                    keyValue[u] = i;
                }
            }
        }

        for(int u = 0; u < inputSplit.length; u++){

            for(int i = 0 ; i < alphabet.length; i++){
                if(inputSplit[u].equals(alphabet[i])){
                    inputValue[u] = i;
                }
            }
        }

        int counter = key.length();
        for(int i =0; i < input.length(); i++){
            if(inputValue[i] < keyValue[i]){
                inputValue[i] = alphabet.length-keyValue[i]+inputValue[i];
            }else{
                inputValue[i] = inputValue[i] - keyValue[i];
            }
            keyValue[counter] = inputValue[i];
            counter++;
        }

        for(int i = key.length() ; i < keyValue.length; i++){
            System.out.print(alphabet[keyValue[i]]);
        }

        for(int i = 0; i < input.length(); i++){
        }
    }
}
