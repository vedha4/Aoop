package com.example.generics;

public interface MinMax<T extends Comparable<T>> {
    T min(T[] array);
    T max(T[] array);
}
