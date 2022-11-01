package org.itstep.task04.array;

import org.itstep.task04.ArraysNotSortException;

import java.util.Arrays;


public class List<T extends Comparable<T>> {
    private T[] arr;

    public List() {
        this.arr = (T[]) new Comparable[0];
    }

    public T[] getArr() {
        return arr;
    }


    public void add(T item) {        // Добавление элемента в массив
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = item;
    }

    public String checkArrays() throws ArraysNotSortException {
        int countUp = 0;
        int countDown = 0;
        // Проверка на наличие сортировки по возрастанию или убыванию
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1 && arr[i].compareTo(arr[i + 1]) <= 0) {               // arr[i] <= arr[i + 1]
                countUp++;
            }
            if (i != arr.length - 1 && arr[i].compareTo(arr[i + 1]) >= 0) {               // arr[i] >= arr[i + 1]
                countDown++;
            }
        }
        System.out.println("countUp = " + countUp);
        System.out.println("countDown = " + countDown);
        if (countUp == arr.length - 1) {
            return true + "Up";
        } else if (countDown == arr.length - 1) {
            return true + "Down";
        } else {
            throw new ArraysNotSortException();
        }
//        return false;
    }

    // Возврат индекса искомого числа с учетом сортировки по возрастанию (check.equals("trueUp")) и убыванию (check.equals("trueDown"))
    public int binarySearch(T search, String check) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
//            int mid = (low + high) >>> 1;
            if (check.equals("trueUp")) {
                mid = (left + right) / 2;
                T midVal = arr[mid];
                if (arr[mid].compareTo(search) < 0) {
                    left = mid + 1;
                } else if (arr[mid].compareTo(search) > 0) {
                    right = mid - 1;
                } else {
                    System.out.println("arr[" + mid + "] = " + arr[mid]);
                    return mid; // search found
                }
            } else if (check.equals("trueDown")) {
                mid = (left + right) / 2;
                T midVal = arr[mid];
                if (arr[mid].compareTo(search) > 0) {
                    left = mid + 1;
                } else if (arr[mid].compareTo(search) < 0) {
                    right = mid - 1;
                } else {
                    System.out.println("arr[" + mid + "] = " + arr[mid]);
                    return mid; // search found
                }
            }
        }
        System.out.println("Такого значения нет");
        return -1;  // search not found.
    }

    @Override
    public String toString() {
        return "List{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }


}
