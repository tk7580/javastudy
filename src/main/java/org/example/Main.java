package org.example;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        long sum = Arrays.stream(inputs)
                .mapToLong(e -> Long.parseLong(e))
                .sum();

//        long sum = 0;
//
//        for (String inputData : inputs){
//            sum += Long.parseLong(inputData);
//        }

        System.out.println(sum);
    }
}
