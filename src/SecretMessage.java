import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int nr = 0;
        do{
            nr = Integer.parseInt(console.nextLine());
        }while(nr < 1 || nr > 100);

        ArrayList<String> lagra = new ArrayList<>();
        for(int u = 0; u < nr; u++){
            String code = console.nextLine();

            int M = 1;
            for(int i = 0; i < 1000; i++){
                M = i*i;
                if(code.length() <= M){
                    break;
                }
            }
            int sqr = (int) Math.sqrt(M);
            int asterisk = M - code.length();

            ;
            if(asterisk > 0){
                for(int i = 0; i < asterisk; i++){
                    code += "*";
                }
            }

            String[][] cube = new String[sqr][sqr];

            for(int i = 0; i < sqr ; i++){
                for(int y = 0; y < sqr; y++){
                    cube[i][0+y] = ""+code.charAt(0);
                    code = code.substring(1);
                }
            }
            String finalAnswer = "";
            for(int i = 0; i < sqr; i++){
                for(int t = 1; t <= sqr; t++){
                    finalAnswer += cube[sqr-t][i];
                }
            }

            finalAnswer = finalAnswer. replaceAll("\\*", "");
            lagra.add(finalAnswer);
        }
        for(String s : lagra){
            System.out.println(s);
        }
    }
}
