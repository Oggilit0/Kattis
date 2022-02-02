import java.util.Scanner;

public class TripleTexting {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int length = input.length();
        String[] storedWord = new String[3];

        for(int i = 0; i < 3; i++){
            storedWord[i] = input.substring(0, length/3);
            input = input.substring(length/3);
        }
        String msg = (storedWord[0].equals(storedWord[1])) ? storedWord[0] : storedWord[2];
        System.out.println(msg);
    }
}