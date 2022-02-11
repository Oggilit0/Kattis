import java.util.ArrayList;
import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {

        int n;
        String input;
        Scanner console = new Scanner(System.in);
        do{
            n = Integer.parseInt(console.nextLine());

        }while(n > 10 || n < 1 );

        ArrayList<String> echo = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            do{
                input = console.nextLine();
                if(input.length() > 100 && !input.matches("^[a-zA-Z]*")){

                }else{
                    echo.add(input);
                }
            }while(input.length() > 100 && !input.matches("^[a-zA-Z]*"));

        }

        for(int i = 0; i < echo.size() ; i++){
            System.out.println(echo.get(i));
            i++;
        }
    }
}
