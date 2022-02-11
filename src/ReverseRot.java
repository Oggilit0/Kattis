import java.util.Scanner;

public class ReverseRot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases;
        String input;
        int T = 0;
        do{
            String tempString = "";
            String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
            String userInput = console.nextLine();

            try{
                cases = Integer.parseInt(userInput.substring(0,2));
                input = userInput.substring(3).toUpperCase();
            }catch(Exception e){
                cases = Integer.parseInt(userInput.substring(0,1));
                if(cases == 0){
                    break;
                }
                input = userInput.substring(2).toUpperCase();
            }

            for(int i = 1; i < input.length()+1; i++){
                tempString += input.charAt(input.length()-i);
            }
            input = tempString;
            boolean test = false;

            tempString = "";
            for(int i = 0; i < input.length(); i++){
                int maxCases = (alfabet.length()-cases)-1;
                for(int u = 0 ; u < alfabet.length(); u++){
                    if (input.charAt(i) == alfabet.charAt(u)){
                        if(u >= maxCases){
                            alfabet = alfabet+alfabet;
                        }
                        tempString += alfabet.charAt((u)+cases);
                        break;
                    }
                }
            }
            System.out.println(tempString);
            T++;
        }while(T != 29);
    }
}
