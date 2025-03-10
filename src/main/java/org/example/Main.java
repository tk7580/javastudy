package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        사람 a = new 사람();

        System.out.println(a.age);
        System.out.println(a.name);
        System.out.println(a.isMarried);

        사람 b = new 사람();
        b.name = "박영수";

        System.out.println(a.age);
        System.out.println(a.name);
        System.out.println(a.isMarried);
    }
}

class 사람{
    int age;
    String name;
    boolean isMarried = true;

    void hello(){
        System.out.println(123);
    }
}