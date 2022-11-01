package org.itstep.task03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class testTask03 {
    @Test
    @DisplayName("class Triangle - CreateTriangleException")
    void triangle() throws CreateTriangleException {
        Assertions.assertThrows(CreateTriangleException.class, new Executable() {
            @Override
            public void execute() throws CreateTriangleException {
                Triangle triangle1 = new Triangle(6, 8, 15);
            }
        });
    }
}
