package util;

import java.util.Scanner;

public class Factorial {
    public long calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the number you would like to find the factorial of: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("util.Factorial is not defined for negative numbers.");
            return -1;
        } else {
            return recursiveFactorial(number);
        }
    }

    public long recursiveFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
