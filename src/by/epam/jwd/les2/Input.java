package by.epam.jwd.les2;

import java.util.Random;
import java.util.Scanner;

public class Input {

    public int inputByScanner(String message) {
        int number;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Вы ввели не число. Попробуйте снова: ");
        }
        number = scanner.nextInt();
        return number;
    }

    public int inputByRandom(String message) {
        int number;
        Random random = new Random();
        number = random.nextInt(20) + 1;
        System.out.println(message + number);
        return number;
    }

    public int[] inputArrayByRandom(int x) {
        int[] arr = new int[x];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) + 1;
        }
        return arr;
    }
}
