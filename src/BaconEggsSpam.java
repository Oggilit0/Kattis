import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaconEggsSpam {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();

        int maxDays = 0;
        do{
            int n;
            do{
                n = Integer.parseInt(console.nextLine());
                if (n == 0){
                    break;
                }
            }while( n < 1 || n > 20);

            if (n == 0){
                break;
            }
            ArrayList<String> food = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();

            for(int i = 0; i < n ; i++){
                String userInput;
                String[] splitUser;
                do {
                    userInput = console.nextLine();
                    name.add(userInput);
                    splitUser = userInput.split(" ");
                }while(splitUser.length > 11);

                for(int u = 1; u < splitUser.length; u ++){
                    if(!name.contains(splitUser[u]) && !food.contains(splitUser[u])){
                        food.add(splitUser[u]);
                    }
                }
            }
            Collections.sort(food);
            String day = "";

            for(String string : food){
                day += string;
                Collections.sort(name);
                for(int i = 0; i < name.size(); i++ ){

                    if(name.get(i).contains(string)){
                        String tempString = name.get(i);
                        String[] tempArray = tempString.split(" ");
                        day +=" " + tempArray[0];
                    }
                }
                if(string != (food.get(food.size()-1))){
                    day+="\n";
                }
            }
            days.add(day);
            maxDays++;
        }while(maxDays <= 100);

        int counter = 0;

        for(String string : days){
            System.out.println(string);
            if(counter < days.size()-1){
                System.out.println();
                counter++;
            }
        }
    }
}
