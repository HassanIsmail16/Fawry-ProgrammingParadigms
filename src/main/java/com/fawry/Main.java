package com.fawry;

public class Main {
    public static void main(String[] args) {
        var doubleNumber = CurryingExample.multiplyBy(2);
        var tripleNumber = CurryingExample.multiplyBy(3);

        System.out.println(doubleNumber.apply(4));
        System.out.println(tripleNumber.apply(4));
        System.out.println(CurryingExample.multiplyBy(5).apply(6));
    }
}