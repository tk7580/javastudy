package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //계산기.합();

        계산기.합( 10, 20); //출력 : 30

        계산기.합( 30, 40); //출력 : 70
        계산기.합( 40, 30); //출력 : 70

//        계산기.합(10, true);
//        계산기.합(10, 40, 100);
//        계산기.합(0);

        계산기.합(0);
    }
}

class 계산기 {

    static void 합(int c){
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    static void 합(int a, int b){
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println(a+b);
    }
}
