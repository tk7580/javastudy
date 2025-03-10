package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a; //정수만 넣음

        MyObject  obj = new MyObject(); //MyObject모양의 객체랑 연결될 obj
        obj.b = "안녕";
        System.out.println(obj.b);
        System.out.println(obj.b);
        System.out.println(obj.b);

        new MyObject().a = 10;
        System.out.println(new MyObject().a);
    }
}

class MyObject{
    int a;
    String b;
    double c;
}