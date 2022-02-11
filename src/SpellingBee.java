import java.util.ArrayList;
import java.util.Scanner;

public class SpellingBee {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String inputWord = console.nextLine();

        int amountOfWords = Integer.parseInt(console.nextLine());

        ArrayList<String> listOfWords = new ArrayList<>();

        for(int i = 0; i < amountOfWords; i++){
            String tempString = console.nextLine();
            if(tempString.length() >= 4){
                listOfWords.add(tempString);
            }
        }
        ArrayList<String> tempList = new ArrayList();

        for (int i = 0; i < listOfWords.size(); i++){
            boolean contains = false;
            if(listOfWords.get(i).contains(""+inputWord.charAt(0))){
                for(int u = 0; u < listOfWords.get(i).length(); u++){
                    if(inputWord.contains("" + listOfWords.get(i).charAt(u))){
                        contains = true;
                    }else{
                        contains = false;
                        break;
                    }
                }
            }else{
                tempList.remove(listOfWords.get(i));
            }
            if (contains){
                tempList.add(listOfWords.get(i));
            }
        }
        for(String string : tempList){
            System.out.println(string);
        }
    }
}
