import java.util.Scanner;

public class Palindrome {
    public boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a word to check if it's a palindrome");
        String str = scanner.nextLine().toLowerCase();
        return palindromeHelper(str);
    }
    private boolean palindromeHelper(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return palindromeHelper(str.substring(1, str.length() - 1));
        else
            return false;
    }
}
