import java.util.Scanner;

public class DrinkingSong {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int maxRounds = 0;
        String content;
        do{
            try{
                maxRounds = Integer.parseInt(console.nextLine());
            }catch(Exception e){
            }
        }while(maxRounds < 1 || maxRounds > 99);

        do{
            content = console.nextLine();

        }while(!content.matches("^[a-zA-Z]+$") || content.length() > 20);

        int round = maxRounds;
        String verse;

        for(int i = 0; i < maxRounds ; i++){

            if(i == (maxRounds-1)){
                verse = (round-i)+ " bottle of " + content+ " on the wall, " + (round-i) + " bottle of "+content+".\n" +
                        "Take it down, pass it around, no more bottles of "+content+".";
            }else if(i == maxRounds-2){
                verse = (round-i)+ " bottles of " + content+ " on the wall, " + (round-i) + " bottles of "+content+".\n" +
                        "Take one down, pass it around, "+ (maxRounds-(i+1))+" bottle of " +content+ " on the wall.";
            } else {
                verse = (round-i)+ " bottles of " + content+ " on the wall, " + (round-i) + " bottles of "+content+".\n" +
                        "Take one down, pass it around, "+ (maxRounds-(i+1))+" bottles of " +content+ " on the wall.";
            }
            if(i == maxRounds-1){
                System.out.print(verse);
            }else{
                System.out.println(verse);
            }
            if(i != maxRounds-1){
                System.out.println();
            }
        }
    }
}
