import java.util.Scanner;
import java.util.ArrayList;
public class AstrologicalSign {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int antal = Integer.parseInt(console.nextLine());

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0 ; i < antal ; i++){
            String input = console.nextLine();

            String[] date = input.split(" ");
            String answer = "";

            switch(date[1]){
                case "Jan":
                    if(Integer.parseInt(date[0]) < 21){
                        answer = "Capricorn";
                    }else{
                        answer ="Aquarius";
                    }
                    break;

                case "Feb":
                    if(Integer.parseInt(date[0]) < 20){
                        answer ="Aquarius";
                    }else{
                        answer ="Pisces";
                    }
                    break;

                case "Mar":
                    if(Integer.parseInt(date[0]) < 21){
                        answer ="Pisces";
                    }else{
                        answer ="Aries";
                    }
                    break;

                case "Apr":
                    if(Integer.parseInt(date[0]) < 21){
                        answer ="Aries";
                    }else{
                        answer ="Taurus";
                    }
                    break;

                case "May":
                    if(Integer.parseInt(date[0]) < 21){
                        answer ="Taurus";
                    }else{
                        answer ="Gemini";
                    }
                    break;

                case "Jun":
                    if(Integer.parseInt(date[0]) < 22){
                        answer ="Gemini";
                    }else{
                        answer ="Cancer";
                    }
                    break;

                case "Jul":
                    if(Integer.parseInt(date[0]) < 23){
                        answer ="Cancer";
                    }else{
                        answer ="Leo";
                    }
                    break;

                case "Aug":
                    if(Integer.parseInt(date[0]) < 23){
                        answer ="Leo";
                    }else{
                        answer ="Virgo";
                    }
                    break;

                case "Sep":
                    if(Integer.parseInt(date[0]) < 22){
                        answer ="Virgo";
                    }else{
                        answer ="Libra";
                    }
                    break;

                case "Oct":
                    if(Integer.parseInt(date[0]) < 23){
                        answer ="Libra";
                    }else{
                        answer ="Scorpio";
                    }
                    break;

                case "Nov":
                    if(Integer.parseInt(date[0]) < 23){
                        answer ="Scorpio";
                    }else{
                        answer ="Sagittarius";
                    }
                    break;

                case "Dec":
                    if(Integer.parseInt(date[0]) < 22){
                        answer ="Sagittarius";
                    }else{
                        answer ="Capricorn";
                    }
                    break;
            }
            result.add(answer);
        }
        for (String s : result){
            System.out.println(s);
        }
    }
}
