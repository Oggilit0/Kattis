package Kattis;

import java.util.Scanner;

public class TheOwlAndTheFoxUF {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int testCases;
            testCases = Integer.parseInt(console.nextLine());

        String[] input = new String[testCases];

        for(int i = 0; i < testCases; i++){
                input[i] = console.nextLine();
        }
        int[] sumOfCases = new int[testCases];

        for(int i = 0; i < testCases; i++){
            int sum = 0;
            switch (input[i].length()){
                case 1:
                    sum = Integer.parseInt(input[i]);
                    break;
                case 2:
                    sum = (Integer.parseInt(""+input[i].charAt(0))) + (Integer.parseInt(""+input[i].charAt(1)));
                    break;
                case 3:
                    sum = (Integer.parseInt(""+input[i].charAt(0))) +
                            (Integer.parseInt(""+input[i].charAt(1))) +
                            (Integer.parseInt(""+input[i].charAt(2)));
                    break;
                case 4:
                    sum = (Integer.parseInt(""+input[i].charAt(0))) +
                            (Integer.parseInt(""+input[i].charAt(1))) +
                            (Integer.parseInt(""+input[i].charAt(2))) +
                            (Integer.parseInt(""+input[i].charAt(3)));
                    break;
                case 5:
                    sum = (Integer.parseInt(""+input[i].charAt(0))) +
                            (Integer.parseInt(""+input[i].charAt(1))) +
                            (Integer.parseInt(""+input[i].charAt(2))) +
                            (Integer.parseInt(""+input[i].charAt(3))) +
                            (Integer.parseInt(""+input[i].charAt(4)));
                    break;
                case 6:
                    sum = 1;
                    break;
            }
            if(Integer.parseInt(input[i]) == 100000){
                sumOfCases[i] = 0;
                break;
            }

            for(int u = Integer.parseInt(input[i]) ; u > 0; u--){
                String uLength = ""+u;
                int sumOfU = 0;

                switch (uLength.length()){
                    case 1:
                        sumOfU = Integer.parseInt(uLength);
                        break;
                    case 2:
                        sumOfU = (Integer.parseInt(""+uLength.charAt(0))) + (Integer.parseInt(""+uLength.charAt(1)));

                        break;
                    case 3:
                        sumOfU = (Integer.parseInt(""+uLength.charAt(0))) +
                                (Integer.parseInt(""+uLength.charAt(1))) +
                                (Integer.parseInt(""+uLength.charAt(2)));
                        break;
                    case 4:
                        sumOfU = (Integer.parseInt(""+uLength.charAt(0))) +
                                (Integer.parseInt(""+uLength.charAt(1))) +
                                (Integer.parseInt(""+uLength.charAt(2))) +
                                (Integer.parseInt(""+uLength.charAt(3)));
                        break;
                    case 5:
                        sumOfU = (Integer.parseInt(""+uLength.charAt(0))) +
                                (Integer.parseInt(""+uLength.charAt(1))) +
                                (Integer.parseInt(""+uLength.charAt(2))) +
                                (Integer.parseInt(""+uLength.charAt(3))) +
                                (Integer.parseInt(""+uLength.charAt(4)));
                        break;
                }
                if( sum == (sumOfU+1)){
                    sumOfCases[i] = Integer.parseInt(uLength);
                    break;
                }
            }
        }
        for(int i : sumOfCases){
            System.out.println(i);
        }
    }
}
