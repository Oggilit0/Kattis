import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String[] userInput = new String[2];

        for(int i = 0; i < 2 ; i++){
            do{
                userInput[i] = console.nextLine();
            }while(!userInput[i].matches("a{0,999}h"));
        }

        if(userInput[0].length() >= userInput[1].length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }

    }
}
