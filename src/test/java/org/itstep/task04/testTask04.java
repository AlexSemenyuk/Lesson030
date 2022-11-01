package org.itstep.task04;

import org.itstep.task04.array.List;
import org.itstep.task04.array.ListInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class testTask04 {
    @Test
    @DisplayName("Main.checkArrays() - ArraysNotSortException")
    void checkArrays() throws ArraysNotSortException {
        int[] arrayInt = new int[]{10, 12, 15, 13, 14, 11, 16, 17, 18, 19};
        List<ListInt> listInt = new List<>();
        for (int i = 0; i < arrayInt.length; i++) {
            listInt.add(new ListInt(arrayInt[i]));
        }
        Assertions.assertThrows(ArraysNotSortException.class, new Executable() {
            @Override
            public void execute() throws ArraysNotSortException {
                listInt.checkArrays();
            }
        });
    }
}
