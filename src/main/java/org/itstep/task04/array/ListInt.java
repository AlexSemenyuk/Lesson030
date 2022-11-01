package org.itstep.task04.array;

public class ListInt implements Comparable<ListInt> {
    private int mean;

    public ListInt(int mean) {
        this.mean = mean;
    }

    public int getMean() {
        return mean;
    }

    @Override
    public String toString() {
        return mean + "";
    }

    @Override
    public int compareTo(ListInt o) {
        return mean - o.mean;
    }
}
