package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here10
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите N: ");
        int N = in.nextInt();
        int x = 1;
        int y = 1;

        for (int i=2; i<N; i++){
            y = x + y;
            x = y - x;
        }
        System.out.print("Число Фибоначчи: " + y);
    }
}
