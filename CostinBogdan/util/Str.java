package util;

import java.util.Scanner;

public class Str {
    public String reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the string to reverse: ");
        String str = scanner.nextLine();
        return make(str);
    }

    public String make(String str) {
        if (str.isEmpty())
            return "";
        return make(str.substring(1)) + str.charAt(0);
    }
}
