package org.itstep.task04;

import org.itstep.task04.array.List;
import org.itstep.task04.array.ListDouble;
import org.itstep.task04.array.ListInt;
import org.itstep.task04.array.ListString;

public class Main {
    public static void main(String[] args) throws ArraysNotSortException {
        // TODO: проверяйте ваш код здесь

        System.out.println("Integer -----------------------------------");
        List<ListInt> listInt = new List<>();
        // Варианты исходных данных (сортировка по возрастанию, убыванию, без сортировки)
        int[] arrayInt = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//        int [] arrayInt = new int[]{19, 18, 17, 16, 15, 14, 13, 12, 11, 10};
//        int [] arrayInt = new int[]{10, 12, 15, 13, 14, 11, 16, 17, 18, 19};
        for (int i = 0; i < arrayInt.length; i++) {
            listInt.add(new ListInt(arrayInt[i]));
        }
        System.out.println(listInt.toString());

        try {
            String checkInt = listInt.checkArrays();
            System.out.println(checkInt);
            ListInt listInt1 = new ListInt(15);
            System.out.println(listInt.binarySearch(listInt1, checkInt));
        } catch (ArraysNotSortException ex) {
            ex.printStackTrace();
        }


        System.out.println("Double -----------------------------------");
        List<ListDouble> listDouble = new List<>();
        // Варианты исходных данных (сортировка по возрастанию, убыванию, без сортировки)
//        double [] arrayDouble = new double[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        double[] arrayDouble = new double[]{19, 18, 17, 16, 15, 14, 13, 12, 11, 10};
//        double [] arrayDouble = new double[]{10, 12, 15, 13, 14, 11, 16, 17, 18, 19};
        for (int i = 0; i < arrayDouble.length; i++) {
            listDouble.add(new ListDouble(arrayDouble[i]));
        }
        System.out.println(listDouble.toString());

        try {
            String checkDouble = listDouble.checkArrays();
            System.out.println(checkDouble);
            ListDouble listDouble1 = new ListDouble(17);
            System.out.println(listDouble.binarySearch(listDouble1, checkDouble));
        } catch (ArraysNotSortException ex) {
            ex.printStackTrace();
        }

        System.out.println("String -----------------------------------");
        List<ListString> listString = new List<>();
        // Варианты исходных данных (сортировка по возрастанию, убыванию, без сортировки)
        String[] arrayString = new String[]{"abc", "bcd", "cdf", "def", "efg", "fgh", "ghi", "hij", "ijk", "jkl"};
//        String [] arrayString = new String[]{"lkj", "kji", "jih", "ihg", "hgf", "gfe", "fed", "fdc", "dcb", "cba"};
//        String [] arrayString = new String[]{"abc", "cdf", "bcd", "def", "efg", "fgh", "ghi", "hij", "ijk", "jkl"}; // 1 и 2 не по порядку

        for (int i = 0; i < arrayString.length; i++) {
            listString.add(new ListString(arrayString[i]));
        }
        System.out.println(listString.toString());

        try {
            String checkString = listString.checkArrays();
            System.out.println(checkString);
            ListString listString1 = new ListString("ghi");
            System.out.println(listString.binarySearch(listString1, checkString));
        } catch (ArraysNotSortException ex) {
            ex.printStackTrace();
        }

    }
}
