import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * cows and bulls
 */
public class CowsAndBulls {
    public static void main(String[] args) {

        int numberToGuess = ThreadLocalRandom.current().nextInt(1000,10000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("number to guess " + numberToGuess);

        String numberToGuessString = String.valueOf(numberToGuess);
        char[] numberGuessChar = numberToGuessString.toCharArray();

        boolean isWinner = false;

        while(!isWinner){
            int bulls = 0;
            int cows = 0;
            int userInput = scanner.nextInt();
            String userInputStr = String.valueOf(userInput);
            char[] userInputChar = userInputStr.toCharArray();
            if(numberToGuess == userInput){
                System.out.println("You win!");
                break;
            }

            if(userInput >= 1000 && userInput <10000){
                for(int i = 0; i < numberGuessChar.length; i++){
                    for(int j = 0; j < userInputChar.length; j++){
                        if((numberGuessChar[i] == userInputChar[j]) && (i == j)){
                            bulls++;
                        } else if(numberGuessChar[i] == userInputChar[j]){
                            cows++;
                        }
                    }
                }
                System.out.println("You have: " + bulls + " bulls and " + cows + " cows");
            } else {
                System.out.println("Please enter a 4 digit number.");
            }
        }
        scanner.close();
    }
}