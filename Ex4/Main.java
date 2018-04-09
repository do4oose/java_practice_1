package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Sieve of Eratosthenes
        /*boolean primes [] = new boolean[101];
        for (int i=0; i<primes.length; i++){
            primes[i]= true;
        }
        primes[0]=false;
        primes[1]=false;

        for (int i=2; i*i<primes.length; i++){
            if (primes[i]){
                for (int j=i*i; j<primes.length; j+=i){
                    primes[j]=false;
                }
            }
        }
        for (int i=0; i<primes.length; i++){
            if(primes[i])
                System.out.print(i+" ");
        }*/

        for (int i = 2; i<101; i++){
            boolean isPrime = true;

            for (int j = 2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
