package org.example;
import org.w3c.dom.ls.LSOutput;
import java.util.ArrayList;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        //입력
        Scanner sc = new Scanner(System.in);

        int a = 0;

        while(true){
            System.out.printf("숫자 : ");
            try{
                a = sc.nextInt(); //대기, 숫자를 입력할 때까지
                sc.nextLine(); //버퍼를 비운다
                break;
            } catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("숫자 똑바로 써");
            }
        }

        System.out.printf("입력한 숫자 : %d\n", a);

        sc.close();
    }
}
