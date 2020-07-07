package com.costaroot.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list;

    public MyList() {
        this.list = new ArrayList<T>();
    }

    public void add(T var) {
        list.add(var);
    }

    public T largestVar() {
        T maxVar = list.get(0);
        for (T var : list) {
            if (var.compareTo(maxVar) >= 1)
                maxVar = var;
        }
        return maxVar;
    }

    public T smallestVar() {
        return Collections.min(list);
    }
}
