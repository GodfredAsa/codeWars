import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class CodePairing {

    public static void main(String[] args) {

        System.out.println(getNewString("Dog bites man"));
        System.out.println(getNewString("Coding is the best!"));

        isPrimeNumber(6);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(getEvenNumbers(numbers));

        System.out.println( "Love repeats: " + getWordRecursion("love","I love love love Love things"));

        System.out.println("----------------------------");

        findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1});

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
      factors.forEach(System.out::println);
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
           assertTrue(isPrimeNumber(5), "is prime");
            assertTrue( isPrimeNumber(7), "is prime");
        });
    }

    public static void findIt(int[] a) {
        int odd = 0;
        int count = 0;
        for (int number: a) {
            for(int i = 0; i < a.length; i++) {
                if(number == a[i]){
                    count++;
                }

            }
        }

//        Integer
        System.out.println(count);

//        System.out.println(odd);

//        return odd;
    }

}




