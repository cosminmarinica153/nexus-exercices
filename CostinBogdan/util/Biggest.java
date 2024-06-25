package util;

import java.util.ArrayList;
import java.util.Scanner;

public class Biggest {
    public int find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the numbers you want to find the max of, with the format: a, b, c, d");
        String rawNumbers = scanner.nextLine();
        String[] charArr = rawNumbers.split(", ");
        ArrayList<Integer> numbersArray = new ArrayList<>();
        fillArrayList(charArr, numbersArray, 0);
        return findMax(numbersArray, 0, Integer.MAX_VALUE);
    }

    public void fillArrayList(String[] charArray, ArrayList<Integer> numbersArray, int index) {
        if (index >= charArray.length) {
            return;
        }
        numbersArray.add(Integer.parseInt(charArray[index]));
        fillArrayList(charArray, numbersArray, index + 1);
    }

    private int findMax(ArrayList<Integer> numbersArray, int index, int currentMax) {
        if (index >= numbersArray.size()) {
            return currentMax;
        }
        int newMax = Math.max(currentMax, numbersArray.get(index));
        return findMax(numbersArray, index + 1, newMax);
    }
}
