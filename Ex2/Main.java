package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение N: ");
        int N = in.nextInt();
        System.out.print("Введите значение степени k: ");
        int k = in.nextInt();


        int sum = 0;
        for (int i =1; i <= N; i++){
            for (int j = 2; j <= k; j++){
                i *= i;
            }
            sum += i;
        }
        System.out.println("Cумма: " + sum);
    }
}
