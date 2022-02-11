import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int stone = console.nextInt();

        if(stone%2 == 1){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }

    }
}
