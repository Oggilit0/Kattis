import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int input = console.nextInt();

        for(int i = 1 ; i <= input; i++ ){
            System.out.println(i+ " Abracadabra");
        }

    }
}
