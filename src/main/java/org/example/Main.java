package org.example;

class Main {
    public static void main(String[] args) {
        // System.out 여기서 . 은 of 를 의미 합니다.
        // System.out.println(100); // 여기서 println(100); 와 같은 형태는 타 동사를 의미합니다.
        // System.out.println(100); // 여기서 System.out 은 주어를 의미 합니다.
        // System.out.println(100); // 여기서 100은 목적어 또는 보어 입니다.
        // System.out.println(100); // 개발자가 "System.out" 라는 녀석에게 100 을 println 하라는 의미

        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        // 출력
        // 안녕안녕안녕

        System.out.println(); // 이 코드는 System.out.print("\n"); 과 같다.

        // 출력
        // \n
        // 추가설명 : 실제로 출력창에 \n 는 보이지 않고 줄바꿈으로 작동한다.

        System.out.println("안녕\n안녕안녕");

        // 출력
        // 안녕
        // 안녕안녕

//        int x; // 변수
//        x = 5; // 변수
//        x = x + 10; // 좌측 x는 변수, 우측 x는 변수가 아닌 값(5)으로 취급
//
//        System.out.println(x + 20); // 여기서의 x는 x가 아닌 15로 취급

        int x = 10;

        System.out.println("x"); // 출력 : x
        System.out.println(x); // 출력 : 10
        System.out.println("x" + x); // 출력 : x10
        System.out.println("x : " + x); // 출력 : x : 10
        System.out.println("x : " + x * 10); // 출력 : x : 100
        System.out.println("x : " + x + 10); // 출력 : x : 1010
        System.out.println("x : " + (x + 10)); // 출력 : x : 20

        int age = 50;

        System.out.println("당신의 나이 : " + age);
        // 당신의 나이 : 50

        if (age >= 20) { // age >= 20 (은)는 결국 실행되면 true 가 된다.
            System.out.println("성년");
        }

        if (age < 20) { // age < 20 (은)는 결국 실행되면 false 가 된다.
            System.out.println("미성년");
        }

        // == : 같다.
        // != : 다르다.

        if (10 > 20 || 1 != 1 || 3 > 2) {
            // 실행?
        }

        // 1단계 : 10 > 20 || 1 != 1 || 3 > 2
        // 2단계 : false || 1 != 1 || 3 > 2
        // 3단계 : false || false || 3 > 2
        // 4단계 : false || false || true
        // 5단계 : false || true // 4단계 앞에 있는 false || false 의 연산결과로 false 가 된다.
        // 6단계 : true

        if (10 > 20 && 1 != 1 && 3 > 2) {
            // 실행?
        }

        // 1단계 : 10 > 20 && 1 != 1 && 3 > 2
        // 2단계 : false && 1 != 1 && 3 > 2 // 여기서 바로 결론이 난다. 왜냐하면 그리고(&&)는 좌측식과 우측식이 모두 참(true)이어야 참(true)으로 결론이 나는데, 좌측식이 이미 거짓이기 때문에 더 이상의 연산이 필요가 없다고 자바가 판단.
        // 3단계 : false

        //
        //
        //
    }
}