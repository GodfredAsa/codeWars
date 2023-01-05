package DataStructuresAndAlgorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SlidingWindow {

    public static void main(String[] args) {

        System.out.println(findMinSubArray(new int[]{2, 1, 5, 2, 3, 2}, 7));
        System.out.println(findMinSubArray(new int[]{2, 1, 5, 2, 8, 2}, 10));
    }

    private static int findMinSubArray(int[] array, int target){
        int start = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            windowSum += array[i];
            while(windowSum >= target){
                minLength = Math.min(minLength, i - start + 1);
                windowSum -= array[start];
                start ++;
            }
        }
        return  minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    @Test
    void test_findMinSubArray(){
        int expected = 2;
        int actual = findMinSubArray(new int[]{2, 1, 5, 2, 3, 2}, 7);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, actual, "non empty array"),
                () ->  Assertions.assertEquals(0, findMinSubArray(new int[]{}, 7), "Empty Array test")
        );
    }
}
