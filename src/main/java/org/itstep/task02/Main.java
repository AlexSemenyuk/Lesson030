package org.itstep.task02;

import org.itstep.task02.exception.GreatHundredException;
import org.itstep.task02.exception.NegativeNumberException;

/**
 * Java. Lesson030. Task02
 * Method getPositiveLessHundredNumber
 * Semenyuk Alexander
 * Date 29.10.2022
 */
public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        System.out.println("Start program");
        try {
            getPositiveLessHundredNumber(-110);
        } catch (NegativeNumberException | GreatHundredException ex) {
            ex.printStackTrace();
        }
        System.out.println("End program");
    }

    static void getPositiveLessHundredNumber(int number) throws NegativeNumberException {
        System.out.println("number = " + number);
        if (number < 0) {
            throw new NegativeNumberException();
        }
        if (number > 100) {
            throw new GreatHundredException();
        }
    }
}
