import java.util.Scanner;

public class LaptopSticker {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int wc,hc,ws,hs;
        boolean check = false;
        do {
            String[] input = (console.nextLine()).split(" ");

            for(String nr : input){
                if(!(Integer.parseInt(nr) > 1000 || Integer.parseInt(nr) < 1)){
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }

            wc = Integer.parseInt(input[0]);
            hc = Integer.parseInt(input[1]);
            ws = Integer.parseInt(input[2]);
            hs = Integer.parseInt(input[3]);


        }while(!check);

        if((wc-1) > ws && ((hc-1) > hs)) {
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
