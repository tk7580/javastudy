package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

        int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs :  6

        rs = Math.n_to_m_prime_numbers_sum(5, 11);
        System.out.println("5부터 11까지 소수 합 : " + rs);
    }

    static int one_to_n_prime_numbers_count(int n){
        int count = 0;
        for(int i = 1; i<= n; i++){
            if(Math.isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
class Math {
    static int n_to_m_prime_numbers_sum(int n, int m){
        int sum = 0;
        for(int i = n; i <= m; i++){
            if(Math.isPrimeNumber(i)){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
    static boolean isPrimeNumber(int num){
        if(num == 1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num %  i == 0){
                sum += i;
            }
        }
        return sum == num + 1;
    }
}