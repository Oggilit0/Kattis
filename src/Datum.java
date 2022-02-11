import java.util.Calendar;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        String[] week = {" ","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        int D,M;

        String[] splitInput = console.nextLine().split(" ");
        D = Integer.parseInt(splitInput[0]);
        M = Integer.parseInt(splitInput[1]);
        calendar.set(2009,(M-1),D);
        System.out.println(week[calendar.get(Calendar.DAY_OF_WEEK)]);
    }
}
