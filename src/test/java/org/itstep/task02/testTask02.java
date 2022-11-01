package org.itstep.task02;

import org.itstep.task02.exception.GreatHundredException;
import org.itstep.task02.exception.NegativeNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class testTask02 {
    @Test
    @DisplayName("Main.getPositiveLessHundredNumber - NegativeNumberException()")
    void getPositiveLessHundredNumberNegative() throws NegativeNumberException {
        Assertions.assertThrows(NegativeNumberException.class, new Executable() {
            @Override
            public void execute() throws NegativeNumberException {
                Main.getPositiveLessHundredNumber(-1);
            }
        });
    }

    @Test
    @DisplayName("Main.getPositiveLessHundredNumber - GreatHundredException()")
    void getPositiveLessHundredNumberGreatHundred() throws GreatHundredException {
        Assertions.assertThrows(GreatHundredException.class, new Executable() {
            @Override
            public void execute() throws GreatHundredException, NegativeNumberException {
                Main.getPositiveLessHundredNumber(105);
            }
        });
    }

}

