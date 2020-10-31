package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //获得一个顺序流.使用主线程，单线程
        Stream<String> stream = arrayList.stream();
        //获得一个并行流
        Stream<String> parallelStream = arrayList.parallelStream();


        Integer[] integers = new Integer[10];
        //获得一个顺序流(数组没有并行流)
        Stream<Integer> integerStream = Arrays.stream(integers);

        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> integerStream2 = Stream.iterate(0, (x) -> x + 2).limit(6);
        integerStream2.forEach(System.out::println); // 0 2 4 6 8 10
        Stream<Double> stream3 = Stream.generate(Math::random).limit(2);
        stream3.forEach(System.out::println);//得到两个随机数
    }
}
