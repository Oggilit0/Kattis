import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int r,e,c;
        String[] answer = new String[n];

        for(int i = 0; i < n; i++){

            String input[] = console.nextLine().split(" ");
            r = Integer.parseInt(input[0]);
            e = Integer.parseInt(input[1]);
            c = Integer.parseInt(input[2]);

            if(r < e-c){
                answer[i] = "advertise";
            }else if(r > e-c){
                answer[i] = "do not advertise";
            }else{
                answer[i] = "does not matter";
            }
        }
        for(String s : answer){
            System.out.println(s);
        }
    }
}
