import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String[] k = console.nextLine().split(" ");
        int expenses = 0;
        for(int i = 0; i < n ; i++){
            if(k[i].charAt(0) == '-'){
                expenses += Integer.parseInt(k[i].substring(1));
            }
        }
        System.out.println(expenses);
    }
}
