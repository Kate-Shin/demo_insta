package com.demo.project.sdk.exam;

import java.util.Optional;

public class Test1 {
//    public static void main(String[] args) {
//        opt_test1();
//        opt_test2();
//        opt_test3();
//    }

    // Optional 객체의 생성
    public static void opt_test1(){

        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");
        System.out.println(opt.get());
        // of() 메소드나 ofNullable() 메소드를 사용하여 Optional 객체를 생성할 수 있다
        // of() 메소드는 null 이 아닌 명시된 값을 가지는 Optional 객체를 반환한다.
        // 만약에  of()메소드를 통해 생성된 Optional 객체에 null 이 지정되면 NullPointerException 예외가 발생한다
        // 따라서 만약 참조 변수의 값이 만에 하나 null의 가능성이 있다면  ofNullable() 메소드를 사용하여 OPtional객체를 생성
        // 하는것이 좋다

        System.out.println(opt.get()); //자바 Optional 객체
    }

    // Optional 객체 접근 get()
    public static void opt_test2(){
        Optional<String> opt = Optional.ofNullable("자바 Optional 객체");

        if(opt.isPresent()) {
            System.out.println(opt.get()); // 자바 Optional 객체
            // get() 메소드를 사용하면 Optional 객체에 지정된 값에 접근할수 있
            // 만약 Optional 객체에 지정된 값이 null이라면, NoSuchElementException
        }
    }

    public static void opt_test3(){
        Optional<String> opt = Optional.empty(); // Optional를 null로 초기화함.

        System.out.println(opt.orElse("빈 Optional 객체"));
        System.out.println(opt.orElseGet(String::new));
        
        // 위와 같은 메소드를 사용하여 null 대신에 대체할 값을 지정할 수ㅜ도 있다
        // 1) orElse() 메소드 : 지정된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환
        // 2) orElseGet()  메소드 : 지정된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 람다 표현시의 결과값을 반환
        // 3) orElseThrow() 메소드 : 지정된 값이 존재하면 그값을 반환하고, 값이 존재하지 않은면 인수로 전달된 예외를 발생시킴
    }

}
