import java.util.Scanner;

public class YinYangStones {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        int white = 0;
        int black = 0;
        for(int i = 0; i <input.length(); i++){
            if(input.charAt(i) == 'W'){
                white++;
            }else {
                black++;
            }
        }
        System.out.println(black >= white+1 || white >= black+1 ? "0" : "1");
    }
}