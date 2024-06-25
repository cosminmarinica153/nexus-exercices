package util;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public boolean check(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the first word:");
        String first = scanner.nextLine();
        System.out.println("Type in the second word:");
        String second = scanner.nextLine();

        if (first.length() != second.length())
            return false;

        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return checkUtil(arr1, arr2, 0);
    }

    public char[] mergeSort(char[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        char[] left = new char[mid];
        char[] right = new char[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public char[] merge(char[] left, char[] right) {
        char[] result = new char[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public boolean checkUtil(char[] arr1, char[] arr2, int index) {
        if (index == arr1.length) {
            return true;
        }

        if (arr1[index] != arr2[index]) {
            return false;
        }

        return checkUtil(arr1, arr2, index + 1);
    }
}
