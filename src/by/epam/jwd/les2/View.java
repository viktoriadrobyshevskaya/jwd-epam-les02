package by.epam.jwd.les2;

import java.util.Arrays;

public class View {

    public void outputBooleanToTheConsole(boolean value) {
        System.out.println(value);
    }

    public void outputDoubleToConsole(String message, double value) {
        System.out.println(message + value);
    }

    public void outputPerimeterAndSquare(double perimeter, double square) {
        System.out.println("Периметр = " + perimeter + ", площадь = " + square);
    }

    public void outputIntToConsole(String message, int value) {
        System.out.println(message + value);
    }

    public void outputArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
