package Kattis;

import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        String userInput ="";
        do{
            try{
                Scanner console = new Scanner(System.in);
                userInput = console.nextLine();
            }catch(Exception e){

            }
        }while(!userInput.matches("^[a-zA-Z]*$"));

        System.out.println(userInput +" "+ userInput +" "+ userInput);

    }

}
