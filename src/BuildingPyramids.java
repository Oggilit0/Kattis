import java.util.Scanner;

public class BuildingPyramids {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int blocks = console.nextInt();
        int levels = 1;
        int Result= 0;

        for(int i = 0 ; i < blocks; i++){
            if(blocks > levels*levels){
                blocks -= levels*levels;
                levels += 2;
            }else if(blocks == levels*levels){
                Result = i+1;
                break;
            }else if(blocks < levels*levels){
                Result = i;
                break;
            }
        }
        System.out.println(Result);
    }
}
