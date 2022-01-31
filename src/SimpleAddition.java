package Kattis;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        BigInteger sum = new BigInteger("0");

        for(int i = 0; i <2; i++){
            sum = sum.add(new BigInteger(console.nextLine()));
        }

        System.out.println(sum);

    }
}
