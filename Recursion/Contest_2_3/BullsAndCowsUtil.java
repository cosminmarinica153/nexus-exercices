package Contest_2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BullsAndCowsUtil {
    Scanner scanner = new Scanner(System.in);
    public int generateNum() {
        int max = 9;
        int size = 4;

        StringBuilder str = new StringBuilder();
        ArrayList <Integer> numArr = new ArrayList<>(size);

        for (int i = 0; i <= max; i++) {
            numArr.add(i);
        }

        Collections.shuffle(numArr);

        for (int i = 0; i < size; i++) {
            str.append(numArr.get(i));
        }

        return Integer.parseInt(str.toString());
    }

    public int getNumber(boolean first) {
        if (first) {
            System.out.println("Welcome to the game of BULLS and COWS.");
            System.out.println("BULLS = # common digits with exact matches.");
            System.out.println("COWS = # common digits in wrong position.");
            System.out.println("Give your best shot: ");
        } else {
            System.out.println("Give your best shot: ");
        }

        return scanner.nextInt();
    }

    public void populateArr(ArrayList<Integer> intArr, Integer num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            intArr.add(a);
        }
    }

    public void playInt() {
        int cows = 0;
        int bulls = 0;
        boolean first = true;
        boolean playing = true;

        int secretNum = generateNum();
        ArrayList <Integer> secretNumArr = new ArrayList<>();
        populateArr(secretNumArr, secretNum);
        System.out.println(secretNumArr);

        while (playing) {
            int guess = getNumber(first);
            first = false;
            ArrayList <Integer> guessArr = new ArrayList<>();
            populateArr(guessArr, guess);

            if (guessArr.size() == secretNumArr.size()) {
                for (int i = 0; i < guessArr.size(); i++) {
                    int guessedEl = guessArr.get(i);
                    int secretEl = secretNumArr.get(i);

                    if (secretNumArr.contains(guessedEl)) {
                        cows++;
                    }

                    if (guessedEl == secretEl) {
                        bulls++;
                    }

                    if (cows == 4 && bulls == 4) {
                        playing = false;
                    }
                }
            }
            System.out.printf("The number of bulls is: %d and the number of cows is: %d", bulls, cows);
        }
        scanner.close();
    }

    public void playString() {
        boolean playing = true;
        boolean first = true;

        String secretNum = String.valueOf(generateNum());
        String[] secretNumArr = secretNum.split("");

        StringBuilder printStr = new StringBuilder();

        for (String c : secretNumArr) {
            printStr.append(" ").append(c);
        }

        System.out.println(printStr);
        while (playing){
            String guessedNum = String.valueOf(getNumber(first));
            first = false;
            String[] guessedNumArr = guessedNum.split("");

            int cows = 0;
            int bulls = 0;

            // Modified
            for (int i = 0; i < secretNumArr.length; i++){
                if (secretNumArr[i].equals(guessedNumArr[i])){
                    bulls++;
                }
                if (secretNum.contains(guessedNumArr[i])) {
                    cows++;
                }
            }
            System.out.printf("The number of bulls is: %d and the number of cows is: %d", bulls, cows);
            if (bulls == 4 && cows == 4) {
                playing = false;
            }
        }
        scanner.close();
    }
}

