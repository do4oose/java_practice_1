package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array1[] = new int [4];


        for (int i = 0; i < array1.length; i++) {
            int random = (int)(Math.random()*100);
            array1[i] = random;
            System.out.print(array1[i]+" ");
        }
        System.out.print("\n");
        int min = array1[0];
        int max = array1[0];
        int aver = 0;
        int sum = 0;
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] < min) {
                min = array1[j];
            }
            if (array1[j] > max) {
                max = array1[j];
            }
            sum += array1[j];
        }
        aver = sum/array1.length;
        System.out.println("Min value " + min);
        System.out.println("Max value " + max);
        System.out.println("Average value " + aver);

    }
}
