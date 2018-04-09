package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array1[] = new int [10];

        for (int i = 0; i < array1.length; i++) {
            int random = (int)(Math.random()*100);
            array1[i] = random;
            System.out.print(array1[i]+" ");
        }
        System.out.print("\n");
        bubbleSort(array1);
        for (int i = array1.length-1; i >= 0 ; i--) {
            System.out.print(array1[i] + " ");
        }
    }
    public static void bubbleSort ( int[] array1){
        //вариант 1
        for (int i = array1.length-1;  i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] < array1[j+1]) {
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
            }
        }
        //вариант 2
        /*for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] < array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }*/
    }
}
