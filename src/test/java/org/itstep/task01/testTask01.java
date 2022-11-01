package org.itstep.task01;


import org.itstep.task01.exception.EmptyListException;
import org.itstep.task01.exception.FullListException;
import org.itstep.task01.exception.ListException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import java.lang.reflect.Executable;
import org.junit.jupiter.api.function.Executable;

public class testTask01 {
    @Test
    @DisplayName("class List method add()")
    void add() throws FullListException {
        List<String> testStringLists = new List<>(10);
        for (int i = 0; i < testStringLists.getSize(); i++) {
            testStringLists.add("A" + i);
        }
        Assertions.assertThrows(FullListException.class, new Executable() {
            @Override
            public void execute() throws ListException {
                testStringLists.add("11");
            }
        });
    }

    @Test
    @DisplayName("class List method removeLast()")
    void removeLast() throws FullListException, EmptyListException {
        List<String> testStringLists = new List<>(10);
        for (int i = 0; i < testStringLists.getSize(); i++) {
            testStringLists.add("A" + i);
        }
        for (int i = 0; i < testStringLists.getSize(); i++) {
            testStringLists.removeLast();
        }
        Assertions.assertThrows(EmptyListException.class, new Executable() {
            @Override
            public void execute() throws ListException {
                testStringLists.removeLast();
            }
        });
    }


}
