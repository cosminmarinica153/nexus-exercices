import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public ArrayList<Integer> check() {
        System.out.println("How many fibonacci numbers do you need?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        if (count >= 1) {
            fibonacciNumbers.add(0);
        }
        if (count >= 2) {
            fibonacciNumbers.add(1);
        }
        fibonacciRecursive(fibonacciNumbers, 0, 1, count - 2);
        return fibonacciNumbers;
    }

    private void fibonacciRecursive(ArrayList<Integer> list, int n1, int n2, int count) {
        if (count <= 0) {
            return;
        }
        int n3 = n1 + n2;
        list.add(n3);
        fibonacciRecursive(list, n2, n3, count - 1);
    }
}
