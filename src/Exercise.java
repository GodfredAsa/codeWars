import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,23,34,56,100,53, 7);
        System.out.println(getEvenNumbers(numbers));

        System.out.println(tryIt("I ha1ve fo500ur and thirteen 13 apples"));

        System.out.println(replaceRemainingCharWithFirst("You"));
        System.out.println("-------------------------------------------");
        System.out.println(rocketLauncher(12));
        System.out.println(rocketLauncher(14));
        System.out.println(rocketLauncher(1969));
        System.out.println(rocketLauncher(100756));

    }

    private static int rocketLauncher(int mass){
        int result = mass / 3;
        return Math.toIntExact(result) - 2;
    }

    private static int getEvenNumbers(List<Integer> numbers){
       return  numbers.stream()
               .filter(isEvenNumber -> isEvenNumber % 2 == 0)
               .map(squareNumber -> Math.pow(squareNumber, 1))
               .map(Double::intValue)
               .reduce(0,Integer::sum);
    }

    public static String replaceRemainingCharWithFirst(String str){
       return Arrays.stream(str.split(""))
                .map( best -> best.replaceAll("[a-z A-Z]", str.substring(0,1)))
               .collect(Collectors.joining(""));
    }

    private static String tryIt(String str){
        return Arrays.stream(str.split(" "))
                .map(word -> word.replaceAll("\\d", ""))
                .collect(Collectors.joining(" "));
    }


}
