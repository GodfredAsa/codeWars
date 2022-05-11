import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CodePairing {

    public static void main(String[] args) {

        System.out.println(getNewString("Dog bites man"));
        System.out.println(getNewString("Coding is the best!"));

        isPrimeNumber(6);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(getEvenNumbers(numbers));

        System.out.println( "Love repeats: " + getWordRecursion("love","I love love love Love things"));

    }

    private static String getNewString(String str){

        StringBuilder sbf = new StringBuilder();
        StringBuilder finalStringBuilder = new StringBuilder();

        String[] arrayOfWords =  str.split(" ");

        for(int i = arrayOfWords.length-1; i >= 0; i--){
            String eachWord =  arrayOfWords[i];
            sbf.append(eachWord).append(" ");
        }

        String formattedString =  sbf.substring(0,1).toUpperCase() + sbf.substring(1);
        finalStringBuilder.append(formattedString);

        return finalStringBuilder.toString().replaceAll("[!]", "");
    }


    private static int getWordRecursion(String word, String phrase){
        String[] wordsFromPhase = phrase.split(" ");

        int numberOfWords = 0;
        for (String eachWord: wordsFromPhase) {
            if(eachWord.equalsIgnoreCase(word)) numberOfWords++;
        }
        return numberOfWords;
    }

    private static boolean isPrimeNumber(int number){
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) factors.add(i);
        }
      factors.forEach(System.out::println); // prints the factors of the number
        return factors.size() <= 2;
    }

    private static List<Integer> getEvenNumbers(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    @Test
    void shouldCheckIfIsPrimeTest(){
        assertAll( () -> {
            assertFalse(isPrimeNumber(10), "is not prime");
           Assertions.assertTrue(isPrimeNumber(5), "is prime");
            Assertions.assertTrue( isPrimeNumber(7), "is prime");
        });
    }























}

//For this challenge, the input is a string of words,
// and the output should be the words in reverse but with the letters in the original order.
// For example, the string “Dog bites man” should output as “man bites Dog.”
//
// After you’ve solved this challenge, try adding sentence capitalization and
// punctuation to your code. So, the string “Coding is the best!” should output as
// “Best the is Coding!”




