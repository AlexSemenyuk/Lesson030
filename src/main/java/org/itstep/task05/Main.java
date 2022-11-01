package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: проверяйте ваш код здесь
        int n = 10;

        for (int i = 0; i < n; i++) {
            Runner runner = new Runner();
            try {
                runner.halt();
            } catch (RuntimeException ex) {
                System.out.println("**halt**");
            } catch (IOException e) {
                throw new IOException();
            }
        }

    }
}
