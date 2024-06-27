package util;

import java.util.Scanner;

public class Num {
    public int sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number to check the sum of it's digits");
        int number = scanner.nextInt();
        return sumCheck(number);
    }
    public boolean palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number to check the sum of it's a palindrome");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumberRecursive(number, 0);
        return number == reversedNumber;
    }
    private static int reverseNumberRecursive(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        reversed = (reversed * 10) + (n % 10);
        return reverseNumberRecursive(n / 10, reversed);
    }
    private int sumCheck(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumCheck(num / 10);
    }
}
