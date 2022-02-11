import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        int n = 0;
        int counter = 0;
        Scanner console = new Scanner(System.in);
        String input;

        do{
            try{
                input = console.nextLine();
                n = Integer.parseInt(input);
            }catch(Exception e){
            }
        }while(n < 1 || n > 1000);

        int[] b = new int[n];
        double[] p = new double[n];

        boolean test = false;

        for(int i = 0; i < n ; i++){
            do{
                input = console.nextLine();
                String[] test2 = input.split(" ");
                if(input.matches("[0-9 .]+")){

                    switch(test2[0].length()){
                        case 1:
                            b[counter] = Integer.parseInt(input.substring(0,1));
                            break;
                        case 2:
                            b[counter] = Integer.parseInt(input.substring(0,2));
                            break;
                        case 3:
                            b[counter] = Integer.parseInt(input.substring(0,3));
                            break;
                        case 4:
                            b[counter] = Integer.parseInt(input.substring(0,4));
                            break;
                    }

                    switch(test2[0].length()){
                        case 1:
                            p[counter] = Double.parseDouble(input.substring(2));
                            break;
                        case 2:
                            p[counter] = Double.parseDouble(input.substring(3));
                            break;
                        case 3:
                            p[counter] = Double.parseDouble(input.substring(4));
                            break;
                        case 4:
                            p[counter] = Double.parseDouble(input.substring(5));
                            break;
                        case 5:
                            p[counter] = Double.parseDouble(input.substring(6));
                            break;
                        case 6:
                            p[counter] = Double.parseDouble(input.substring(7));
                            break;
                    }

                    if(!(b[counter] >= 2 && b[counter] <= 1000)){
                        test = false;
                    }else if(!((p[counter] > 0) && (p[counter] < 1000))){
                        test = false;
                    }else {
                        test = true;
                    }
                }
            }while(!test);
            counter++;
        }

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("0.0000", otherSymbols);

        double bpm;
        double test1;
        double test2;

        for(int i = 0 ; i <n ; i++){

            bpm = (60*b[i]) / p[i];
            test1 = (bpm - (60/p[i]));
            test2 = (bpm + (60/p[i]));

            if(i == n-1){
                System.out.print(df.format(test1) + " "+ df.format(bpm) + " " + df.format(test2));
            }else{
                System.out.println(df.format(test1) + " "+ df.format(bpm) + " " + df.format(test2));
            }
        }
    }
}
