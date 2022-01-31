import java.util.Scanner;
public class OneChickenPerPerson {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int firstNr = console.nextInt();
        int secondNr = console.nextInt();
        int sum = firstNr - secondNr;

        if (sum < 0){
            sum = secondNr - firstNr;
            if (sum == 1){
                System.out.println("Dr. Chaz will have " + sum +" piece of chicken left over!" ) ;
            }else {
                System.out.println("Dr. Chaz will have " + sum +" pieces of chicken left over!" ) ;
            }

        }else {

            if (sum == 1){
                System.out.println("Dr. Chaz needs " + sum +" more piece of chicken!");
            }else {
                System.out.println("Dr. Chaz needs " + sum +" more pieces of chicken!");
            }

        }


    }
}