import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeParingII {
/**
 * Two words are anagrams if they contain the same letters but in a different order.
 * Here are a few examples of anagram pairs:
 *
 * -    “listen” and “silent”
 * -  “binary” and “brainy”
 * -    “Paris” and “pairs”
 *
 * For a given input of two strings, return a Boolean
 * TRUE if the two strings are anagrams.
 */

public static void main(String[] args) {

    System.out.println(isAnagram("listen", "silent"));
    System.out.println(isAnagram("listen", "silenti"));
    System.out.println(isAnagram("binary", "brainy"));
    System.out.println(isAnagram("Paris", "pairs"));

    int[] numArray = new int[]{20000,50,10,100,5,1000};

    System.out.println(Arrays.toString(getHighestPair(numArray)));
    System.out.println("----------------------------------------------");
    System.out.println(getHighestProduct(Arrays.asList(20,50,10,1,5,-1)));

    getFirstElements("\n00111\n00111\n00111");
}

    private static boolean isAnagram(String firstWord, String secondWord){
    String[] arrayOfWords = firstWord.split("");
    boolean result = false;
        if(firstWord.length() != secondWord.length()) return false;

        for(int i = 0; i < firstWord.length(); i++) {
            result = secondWord.contains(arrayOfWords[i]);
        }
        return result;
    }

    private static int[] getHighestPair(int[] arrayOfNumber){
    int firstNumber;
    int secondNumber;
    int total = 1;
    int[] pairs = new int[3];
        for (int i=0; i< arrayOfNumber.length; i++) {
            for (int j = 1+i; j < arrayOfNumber.length; j++) {
                if (arrayOfNumber[i] * arrayOfNumber[j] > total) {
                    firstNumber = arrayOfNumber[i];
                    secondNumber = arrayOfNumber[j];
                    total = firstNumber * secondNumber;

                    pairs[0] = firstNumber;
                    pairs[1] = secondNumber;
                    pairs[2] = total;
                }
            }
        }
        return pairs;
    }

    private static List<Integer> getHighestProduct(List<Integer> numbers){
    List<Integer> results = new ArrayList<>();
    int firstHighestNumber = 0;
    int secondHighestNumber = 0;
    int product = 0;

        for (int i = 0; i <numbers.size() ; i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(j) * numbers.get(i)  > product){
                    product = numbers.get(j) * numbers.get(i);
                    firstHighestNumber = numbers.get(j);
                    secondHighestNumber = numbers.get(i);
                }
            }
        }
        results.add(firstHighestNumber);
        results.add(secondHighestNumber);
        results.add(product);

        System.out.println(
                "j value: " +
                firstHighestNumber + ", i value: " +
                secondHighestNumber + ", product: " +
                product);
    return results;
    }

    private static void getFirstElements(String str){

    int zeroBits = 0;
    int oneBits = 0;
        for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '0'){
                    zeroBits++;
                }else if(str.charAt(i) =='1'){
                    oneBits++;
            }
        }

        System.out.println("Number of 1s: " + oneBits + ", Number of Zeros: " + zeroBits );

    }
}
