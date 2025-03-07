package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;

        int[] arr = new int[4];

        for(int i = 0; i<arr.length; i++){
            arr[i] = (i + 1) * 10;
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int avg =sum / arr.length;

        System.out.printf("총합 : %d\n", sum);

        System.out.println("평균 : " + avg);
    }
}