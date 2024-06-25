package util;

import java.util.ArrayList;
import java.util.Scanner;

public class Smallest {
    public int find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the numbers you want to find the smallest, with the format: a, b, c, d");
        String rawNumbers = scanner.nextLine();
        String[] charArr = rawNumbers.split(", ");
        ArrayList<Integer> numbersArray = new ArrayList<>();
        Biggest smallest = new Biggest();
        smallest.fillArrayList(charArr, numbersArray, 0);
        return findMin(numbersArray, 0, Integer.MAX_VALUE);
    }

    private static int findMin(ArrayList<Integer> numbersArray, int index, int currentMin) {
        if (index >= numbersArray.size()) {
            return currentMin;
        }
        int newMin = Math.min(currentMin, numbersArray.get(index));
        return findMin(numbersArray, index + 1, newMin);
    }
}
