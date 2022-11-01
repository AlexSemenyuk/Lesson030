package org.itstep.task01;


import org.itstep.task01.exception.EmptyListException;
import org.itstep.task01.exception.FullListException;

import java.util.Arrays;

public class List<T> {
    private T[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = (T[]) (new Object[size]);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T item) throws FullListException {
        if (cur < size) {
//            obj[cur++] = item;
            cur++;
            obj[cur - 1] = item;
        } else if (cur == size) {
            throw new FullListException();
        }
    }

    public void removeLast() throws EmptyListException {
        if (cur >= 1) {
            cur--;
            obj[cur] = null;
//        obj[--cur] = null;
        } else {
            throw new EmptyListException();
        }
    }

    public void printArray() {
        for (int i = 0; i < obj.length; i++) {
            System.out.println("obj[" + i + "] = " + obj[i]);
        }
    }


}


