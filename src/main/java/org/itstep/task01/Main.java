package org.itstep.task01;


import org.itstep.task01.exception.EmptyListException;
import org.itstep.task01.exception.FullListException;

/**
 * Java. Lesson030. Task01
 * Class List
 * Semenyuk Alexander
 * Date 29.10.2022
 */
public class Main {
    public static void main(String[] args) throws FullListException {
        // TODO: проверяйте ваш код здесь

        System.out.println("Start program");
        List<String> stringLists = new List<>(10);
        // Добавление с перебором
        for (int i = 0; i < stringLists.getSize() + 2; i++) {
            try {
                stringLists.add("A" + i);
            } catch (FullListException e) {
                e.printStackTrace();
                System.err.println("Array is full");
            }
        }
        stringLists.printArray();

        // Удаление с перебором
        for (int i = 0; i < stringLists.getSize() + 2; i++) {
            try {
                stringLists.removeLast();
            } catch (EmptyListException ex) {
                ex.printStackTrace();
                System.err.println("No items");
            }
        }
        stringLists.printArray();
        System.out.println("End program");
    }
}
