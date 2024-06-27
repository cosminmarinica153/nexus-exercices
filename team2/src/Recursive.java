import java.time.Instant;
import java.util.*;
import java.io.*;

public class Main {
    private static int recursiveFactorial(int n) {

        if (n<=1){
            return 1;
        }
        else{

            return n*recursiveFactorial(n-1);

        }


    }

    private static int recursiveMaxOf3(int[] arr, int i, int max) {
        if (arr.length==i){
            return max;
        }
        if (arr[i] > max){
            max = arr[i];

        }
        return recursiveMaxOf3(arr, i+1, max);
    }

    private static boolean recursivePrimeOrNot(int n, int divisor){
        if (n<=2){
            return true;
        }
        if (n%divisor == 0){
            return false;
        }
        if(divisor*divisor>n){
            return true;
        }
        return recursivePrimeOrNot(n, divisor+1);

    }

    private static int recursiveFib(int n) {
        if (n<=0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else return recursiveFib(n-1)+recursiveFib(n-2);
    }

    private static void recursivePrintFib(int term, int current) {
        if (current < term){
            System.out.print(recursiveFib(current)+ " ");
            recursivePrintFib(term, current+1);
        }
    }

    private static boolean recursiveIsPalindrome(String str){
        if (str.length()<=1){
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        return recursiveIsPalindrome(str.substring(1, str.length()-1));
    }

    private static String recursiveLongestWord(String[] str, int i, String max) {
        if (str.length==i){
            return max;
        }
        if (str[i].length()>max.length()){
            max = str[i];
        }
        return recursiveLongestWord(str, i+1, max);
    }

    private static boolean recursiveCheckingAnagrams(String str1, String str2) {
        if (str1.length()!=str2.length()){
            return false;
        }
        if (str1.isEmpty() && str2.isEmpty()){
            return true;
        }

        char ch = str1.charAt(0);//str1 = 'ana' -> ch = 'a'
        int i = str2.indexOf(ch);//str2 = 'rae' -> i = 1

        if (i == -1){
            return false;
        }

        String newStr1 = str1.substring(1);//newStr = 'na'
        String newStr2 = str2.substring(0, i) + str2.substring(i+1);
        //newStr2 = 'ra'+ 'e'
        return recursiveCheckingAnagrams(newStr1, newStr2);
    }

    private static double recursiveCalcAvg(int[] arr, int i, int sum){
        if (arr.length==0){
            return 0;
        }
        if (arr.length==1){
            return arr[0];
        }
        if (i < arr.length){
            sum += arr[i];
            return recursiveCalcAvg(arr, i+1, sum);
        }
        double avg = (double)sum/arr.length;
        return avg;
    }

    private static String recursiveReverseString(String str){
        if (str.isEmpty()){
            return str;
        }
        if (str.length()==1){
            return str;
        }

        return recursiveReverseString(str.substring(1))+str.charAt(0);
    }

    private static int recursiveMin(int[] arr, int i) {
        if (arr.length-1==i){
            return arr[i];
        }
        int minRest = recursiveMin(arr, i + 1);

        return Math.min(arr[i], minRest);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[]{11, 44, 50};
        int[] arr1 = new int[]{10, 20, 30};
        String stringToSplit = "Ana este frumoasa de da in gropile cerului.";
        String[] str = stringToSplit.split(" ");
        long startTime = System.nanoTime();
        System.out.println(recursiveFactorial(5));
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime+" ns");
        System.out.println(recursiveMaxOf3(arr,0,arr[0]));
        totalTime = endTime - totalTime;
        System.out.println(totalTime+" ns");
        totalTime = endTime - startTime;
        System.out.println(recursivePrimeOrNot(11,2));
        System.out.println(totalTime+" ns");
        recursivePrintFib(7, 0);
        System.out.println();
        System.out.println(recursiveIsPalindrome("mere"));
        System.out.println(recursiveIsPalindrome("ana"));
        System.out.println(recursiveLongestWord(str, 0, str[0]));
        System.out.println(recursiveCheckingAnagrams("mare", "rame"));
        System.out.println(recursiveCheckingAnagrams("are", "ana"));
        System.out.println(recursiveCalcAvg(arr1, 0, 0));
        System.out.println(recursiveReverseString("t"));
        System.out.println(recursiveMin(arr1, 0));

    }
}