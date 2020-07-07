package com.costaroot.generic;

public class HighestLowestElement<T extends Comparable<T>> {
    private final T[] arr;

    public HighestLowestElement(T[] arr) {
        this.arr = arr;
    }

    public T getHigh() {
        T maxVar = arr[0];
        for (T var : arr) {
            if (var.compareTo(maxVar) >= 0)
                maxVar = var;
        }
        return maxVar;
    }

    public T getLow() {
        T lowVar = arr[0];
        for (T var : arr) {
            if (var.compareTo(lowVar) < 0)
                lowVar = var;
        }
        return lowVar;
    }
}
