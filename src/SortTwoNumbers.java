import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a,b;

        a = console.nextInt();
        b = console.nextInt();

        if(a < b){
            System.out.println(a + " " + b);
        }else{
            System.out.println(b + " " + a);
        }

    }
}
