package org.itstep.task03;

public class Main {
    public static void main(String[] args) throws CreateTriangleException {
        // TODO: проверяйте ваш код здесь
        try {
            Triangle triangle = new Triangle(5, 7, 8);
        } catch (CreateTriangleException ex) {
            System.out.println("It is not triangle");
            ex.printStackTrace();
        }

        try {
            Triangle triangle1 = new Triangle(3, 8, 4);
        } catch (CreateTriangleException ex) {
            System.out.println("It is not triangle");
            ex.printStackTrace();
        }


    }
}
