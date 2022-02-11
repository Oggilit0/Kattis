import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String input;
        String alphabeth;

        do{
            input = console.nextLine();

        }while((input.length() < 1 || input.length() > 16) && !input.matches("[a-b,A-Z]"));

        do{
            alphabeth = console.nextLine();
        }while((alphabeth.length() != 26) && !alphabeth.matches("^[a-b,A-Z]"));


        String[] alfaTest = alphabeth.split("");

        String tempString = "";
        int counter = 0;
        boolean win = true;

        for(int u = 0 ; u < alfaTest.length; u++){
            if(input.contains(alfaTest[u])){

                for(int y = 0; y < input.length(); y++){
                    if(("" + input.charAt(y)).equals(alfaTest[u])){

                    }else{
                        tempString += input.charAt(y);
                    }
                }
                input = tempString;
                tempString = "";
            }else{
                counter ++;
            }
            if (input.equals("")){
                break;
            }else if (counter > 9){
                win = false;
                break;
            }
        }
        if(win){
            System.out.print("WIN");
        }else{
            System.out.print("LOSE");
        }

    }
}
