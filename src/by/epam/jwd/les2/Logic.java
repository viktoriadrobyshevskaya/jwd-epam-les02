package by.epam.jwd.les2;

public class Logic {

    public boolean task1(int x) {
        return (x / 1000) + (x / 100 % 10) == (x / 10 % 10) + (x % 10);
    }

    public double task2(int a, int b, int c) {
        double x;

        double temp = b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        double temp1 = temp / (2 * a);
        x = temp1 - Math.pow(a, 3) * c + Math.pow(b, -2);

        return x;
    }

    public double task3Perimeter(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + (a + b);
    }

    public double task3Square(int x, int y) {
        return (x * y) / 2.0;
    }

    public boolean task4(int x, int y) {
        return ((x <= 2 && x >= -2) && (y <= 4 && y >= 0)) || ((x <= 4 && x >= -4) && (y <= 0 && y >= -3));
    }

    public int task6(int a, int b, int c) {
        int max;
        int min;

        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);

        return max + min;
    }

    public int task8(int k, int[] array) {
        int sum = 0;

        for (int j : array) {
            if (j % k == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
