package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        사람 a = new 사람();
        a.age = 23;
        a.name = "김철수";
        a.isMarried = false;
        a.introduce();

        사람 b = new 사람();
        b.age = 24;
        b.name = "박영수";
        b.isMarried = true;
        b.introduce();
        
    }
}

class 사람{
    int age;
    String name;
    boolean isMarried = true;

    void introduce(){
        int age = this.age;
        System.out.println("==자기소개==");
        System.out.printf("이름 : %s\n", "김철수");
        System.out.printf("나이 : %d\n", "age");
        System.out.println("결혼여부 : %b\n", true);
    }
}