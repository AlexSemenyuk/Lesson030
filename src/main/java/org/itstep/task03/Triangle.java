package org.itstep.task03;

public class Triangle {
    private final int one;
    private final int two;
    private final int three;

    public Triangle(int one, int two, int three) throws CreateTriangleException {
        this.one = one;
        this.two = two;
        this.three = three;
        if (one + two > three && two + three > one && one + three > two) {
            System.out.println("Triangle with sides: " + one + ", " + two + ", " + three);
        } else {
            throw new CreateTriangleException();
        }
    }

}
