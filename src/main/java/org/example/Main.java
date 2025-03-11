package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Myclass a = new Myclass();
        a.hi();

        new Myclass().hi();

//        hi();

        funA();

    }

    static void funA() {
        System.out.println("funA 실행됨");
    }
}

class Myclass{
    void hi(){
        System.out.println("hi 실행됨");
    }
}
