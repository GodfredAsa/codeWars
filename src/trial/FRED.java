package trial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FRED {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        int[] a  = {1,2,4,4,5,6,7};

        for(int b: a){
            list.add(b);
        }

        System.out.println("list: " +listToSet(list));
    }


    static Set<Integer> listToSet(List<Integer> numbers){
        return new HashSet<>(numbers);

    }
}
