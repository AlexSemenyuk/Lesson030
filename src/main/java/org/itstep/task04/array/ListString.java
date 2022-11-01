package org.itstep.task04.array;

public class ListString implements Comparable<ListString> {
    private String mean;

    public ListString(String mean) {
        this.mean = mean;
    }

    public String getMean() {
        return mean;
    }

    @Override
    public String toString() {
        return mean + "";
    }

    @Override
    public int compareTo(ListString o) {
        return mean.compareTo(o.mean);
    }
}
