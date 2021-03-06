package trial;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FRED {
    public static void main(String[] args) {

        System.out.println(getMeasurement(199));
        System.out.println(getMeasurement(200));
        System.out.println(getMeasurement(208));
        System.out.println(getMeasurement(200));
        
        List<Integer> list = new ArrayList<>();
        int[] a = {1, 2, 4, 4, 5, 6, 7};

        for (int b : a) {
            list.add(b);
        }

        System.out.println("list: " + listToSet(list));
    }

    static Set<Integer> listToSet(List<Integer> numbers) {
        return new HashSet<>(numbers);
    }

    private static String getMeasurement(int number){
        int currentMeasurement = 199;
        if(number > currentMeasurement){
            return "Increased";
        }
        else{
            return "Decreased";
        }
    }

}
