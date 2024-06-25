package util;

import java.util.Scanner;

public class Prime {
    static boolean check() {
        System.out.println("Please type in a number to check if it's prime or not");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        return isPrimeHelper(n, 2);
    }

    static boolean isPrimeHelper(double n, int i) {
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrimeHelper(n, i + 1);
    }
}
