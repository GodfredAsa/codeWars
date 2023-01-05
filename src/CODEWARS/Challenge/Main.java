package CODEWARS.Challenge;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Submarine submarine = new Submarine();
        submarine.setDepth(199);
        System.out.println(submarine.getMeasurement(199));
        System.out.println(submarine.getMeasurement(200));
        System.out.println(submarine.getMeasurement(208));
        System.out.println(submarine.getMeasurement(210));
        System.out.println(submarine.getMeasurement(200));
        System.out.println(submarine.getMeasurement(207));
        System.out.println(submarine.getMeasurement(240));
        System.out.println(submarine.getMeasurement(269));
        System.out.println(submarine.getMeasurement(260));
        System.out.println(submarine.getMeasurement(263));
        System.out.println(submarine.getMeasurement(262));
        System.out.println(submarine.getMeasurement(263));
        System.out.println(submarine.getMeasurement(263));

        System.out.println("----------------------------------------");
        System.out.println(getFloors("(()))"));
        System.out.println(getFloors("(())"));
        System.out.println(getFloors("()()"));
        System.out.println(getFloors("(()(()("));
        System.out.println(getFloors(")())())"));
        System.out.println("----------------------------------------");

        List<Integer> masses = Arrays.asList(12, 14, 1969, 100756);
        getMyFloor(masses, x -> (x / 3) - 2);
        getStringOfNumbersToIntegerArray("123");
    }

    private static int[] getStringOfNumbersToIntegerArray(String str) {
        return Arrays.stream(str.split(""))
                .mapToInt(Integer::parseInt)
                .map(number -> number + 10)
                .peek(System.out::println)
                .toArray();
    }

    private static int getFloor(String str) {
        int counter = 0;
        int index = 0;

        while (index < str.length()) {
            if (str.charAt(index) == '(') {
                counter++;
            } else {
                counter--;
            }
            index++;
        }
        return counter;
    }

    private static void getMyFloor(List<Integer> masses, Function<Integer, Integer> floorCalculator) {
        masses.stream()
                .map(floorCalculator)
                .forEach(System.out::println);
    }

    private static int getFloors(String str) {
        return Arrays.stream(str.split("")).map(parenthesis -> {
            int counter = 0;
            if (parenthesis.charAt(0) == '(') counter++;
            else counter--;
            return counter;
        }).reduce(0, Integer::sum);
    }
}
