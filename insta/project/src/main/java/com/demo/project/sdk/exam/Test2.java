package com.demo.project.sdk.exam;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        s_test1();
        s_test2();

    }

    public static void s_test1(){
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream=list.stream();
        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        stream.forEach(System.out.println(""));
    }

    public static void s_test2(){
        String[] arr=new String[]{"넷","둘","셋","하나"};

        // 배열에서 스트림 생성
        Stream<String>stream1= Arrays.stream(arr);
        stream1.forEach(e->System.out.print(e+" "));
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String>stream2= Arrays.stream(arr,1,3);
        stream2.forEach(e->System.out.print(e+" "));
    }


}
