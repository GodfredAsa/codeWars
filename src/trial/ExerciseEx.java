package trial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExerciseEx {
    private static final Scanner scanner = new Scanner(System.in);
    /**
     * write a program that enables the user to enter a number
     * it returns the value entered in sorted order
     * Also write a second program that returns the index of the value entered
     * @param args
     */
    public static void main(String[] args) {
        boolean quit = false;
        List<Integer> sorted = new ArrayList<>();
        System.out.println(sorted);

        while(!quit){
            System.out.print("Enter a number: ");
            int action = scanner.nextInt();
            System.out.println(sortedList(sorted, action));
        }
    }

    private static List<Integer> sortedList(List<Integer> numbers, int number){
        numbers.add(number);
        numbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
       getIndex(numbers, number);
       return numbers;
    }

    private static void getIndex(List<Integer> numbers, int number){
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == number) {
                if(numbers.indexOf(number) == i) printIndexOfNumber(number, numbers.indexOf(number) );
            }
        }
    }

    private static void printIndexOfNumber(int number, int index){
        System.out.println(number + " index position: " + index);
    }
}
