package org.itstep.task04.array;

public class ListDouble implements Comparable<ListDouble> {
    private double mean;

    public ListDouble(double mean) {
        this.mean = mean;
    }

    public double getMean() {
        return mean;
    }

    @Override
    public String toString() {
        return mean + "";
    }

    @Override
    public int compareTo(ListDouble o) {
        return (int) (mean - o.mean);
    }
}
