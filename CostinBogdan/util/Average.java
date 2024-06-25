package util;

import java.util.Scanner;

public class Average {
    public int check(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the numbers you want to find the average of, like this: a, b, c, d");
        String rawNumbers = scanner.nextLine();
        String[] charArray = rawNumbers.split(", ");
        int[] numbersArray = new int[charArray.length];
        fillArray(charArray, numbersArray, 0);
        return calculateSum(numbersArray, numbersArray.length) / numbersArray.length;
    }

    private static void fillArray(String[] charArray, int[] numbersArray, int index) {
        if (index >= charArray.length) {
            return;
        }
        numbersArray[index] = Integer.parseInt(charArray[index]);
        fillArray(charArray, numbersArray, index + 1);
    }

    private static int calculateSum(int[] numbersArray, int length) {
        if (length <= 0) {
            return 0;
        }
        return numbersArray[length - 1] + calculateSum(numbersArray, length - 1);
    }
}
