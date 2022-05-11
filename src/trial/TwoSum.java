package trial;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] test = {2,7,8,5};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(test, target)));
    }

    private static int[] twoSum(int[] array, int target) {
        int difference;
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            difference = target - array[i]; //16 - 2 = 14
            if (tempMap.containsKey(difference)) { // 14
                return new int[] {tempMap.get(difference), i};
            }
            tempMap.put(array[i], i);
        }
        return null;
    }
}
