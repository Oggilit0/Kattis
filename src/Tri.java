import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String numbers[] = console.nextLine().split(" ");
        int nrOne = Integer.parseInt(numbers[0]);
        int nrTwo = Integer.parseInt(numbers[1]);;
        int nrThree = Integer.parseInt(numbers[2]);;
        String arithmeticArray[] = {"+","-","*","/"};
        String result = nrOne + "";
        for(int i = 0; i < arithmeticArray.length; i++){

            switch(arithmeticArray[i]){
                case "+":
                    if(nrOne + nrTwo == nrThree){
                        result += "+" + nrTwo + "=" + nrThree;
                    }else if(nrOne == nrTwo + nrThree){
                        result += "=" + nrTwo + "+" + nrThree;
                    }
                    break;
                case "-":
                    if(nrOne - nrTwo == nrThree){
                        result += "-" + nrTwo + "=" + nrThree;
                    }else if(nrOne == nrTwo - nrThree){
                        result += "=" + nrTwo + "-" + nrThree;
                    }
                    break;
                case "*":
                    if(nrOne * nrTwo == nrThree){
                        result += "*" + nrTwo + "=" + nrThree;
                    }else if(nrOne == nrTwo * nrThree){
                        result += "=" + nrTwo + "*" + nrThree;
                    }
                    break;
                case "/":
                    if(nrOne / nrTwo == nrThree){
                        result += "/" + nrTwo + "=" + nrThree;
                    }else if(nrOne == nrTwo / nrThree){
                        result += "=" + nrTwo + "/" + nrThree;
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}
