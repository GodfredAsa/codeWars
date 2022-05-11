package dateManipulation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DateManipulator {
    public static void main(String[] args) {
        DateManipulator dm = new DateManipulator();

        List<String> fruits = Arrays.asList();
        List<String> vegetables = Arrays.asList("tomato", "pepper", "eggplant");


        getFood(fruits, vegetables);


        LocalDate curDate = LocalDate.now();

        System.out.println("Current date is "+ curDate);

        System.out.println("Date after 5 days is "+ curDate.minusDays(1));
        System.out.println("Date before 5 days is "+ curDate.plusDays(5));
        System.out.println("Date after 5 months is "+curDate.plusMonths(5));
        System.out.println("Date after 5 years is: start of day =>  "+ curDate.atStartOfDay());

        LocalDate startDate = LocalDate.of(20022, 3, 31);
        System.out.println(startDate.minusDays(1));
         String ap = "AP";

        if(Location.AP.toString().equals(ap)) System.out.println("Yes!");

        if(Location.SH.equals(ap)) System.out.println("Yes!");
    }



    private static void getFood(List<String> fruits, List<String> vegetables){

        List<String> filteredFruits  = fruits.stream()
                .filter(f-> f.contains("o"))
                .collect(Collectors.toList());

        List<String> filteredVegetables = vegetables.stream()
                .filter(f-> f.contains("p"))
                .collect(Collectors.toList());


        List<String> allFruits = new ArrayList<>();

        allFruits.addAll(filteredFruits);
        allFruits.addAll(filteredVegetables);

        allFruits.stream().forEach(System.out::println);
    }
}
