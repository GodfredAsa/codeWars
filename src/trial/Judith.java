package trial;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Judith {

    public static void main(String[] args) {
        List<Integer> numberList = List.of(1,9,45);
        System.out.println(sortedAddNumberList(numberList, 10));
    }

    public static List<Integer> sortedAddNumberList(List<Integer> sortedList, int number){
        List<Integer> numbersSorted = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        numbersSorted.addAll(firstList(sortedList));
        numbersSorted.addAll(secondList(sortedList));
        for(int i = 0; i < number; i++) {
           numbersSorted.add(number-i);
            result = numbersSorted;
        }
        return result
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> firstList(List<Integer> firstList){
        return firstList.subList(0, firstList.size()/2);
    }

    private static List<Integer> secondList(List<Integer> firstList){
        return firstList.subList(firstList.size()/2, firstList.size());
    }

}
