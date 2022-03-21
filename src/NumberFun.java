import java.util.ArrayList;
import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        double[] num = new double[3];
        ArrayList<String> answer = new ArrayList<>();
        for(int u =0; u < n ; u++){
            for(int i = 0; i < 3 ; i++){
                num[i] = console.nextInt();
            }
            ArrayList<Boolean> imp = new ArrayList<>();

            imp.add((num[2] == num[0]+num[1]));
            imp.add((num[2] == num[0]*num[1]));
            imp.add((num[2] == num[0]-num[1]));
            imp.add((num[2] == num[0]/num[1]));
            imp.add((num[2] == num[1]-num[0]));
            imp.add((num[2] == num[1]/num[0]));

            answer.add(imp.contains(true) ? "Possible": "Impossible");
        }

        for(String s : answer){
            System.out.println(s);
        }

    }
}
