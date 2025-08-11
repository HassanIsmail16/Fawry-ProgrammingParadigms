package com.fawry;

import java.util.function.IntFunction;

public class CurryingExample {
    public static IntFunction<Integer> multiplyBy(int x) {
        return (int y) -> x * y;
    }
}
