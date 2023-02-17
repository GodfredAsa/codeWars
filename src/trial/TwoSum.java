package trial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class TwoSum {
    public static void main(String[] args) {
//        int[] test = {2,7,8,5};
//        int target = 15;
//        System.out.println(Arrays.toString(testTwoSum(test, target)));
//
//        TwoSum t = new TwoSum();
//        t.getMatchString("I am learning Python, for python is a good programming language");
//        System.out.println(removeDuplicate(new int[]{2,3,3,4,5,6,9,9}));

//        System.out.println(findTemperature(new int[]{1, 10, 100, -30}));

//        System.out.println(Arrays.toString(pairWithTargetSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 13)));
//        System.out.println(Arrays.toString(pairWithTargetSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 10)));

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

    private static int[] testTwoSum(int[] numberArray, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numberArray.length; i++) {
            int difference = target - numberArray[i] ;
            if(map.containsKey(difference)) return new int[]{map.get(difference), i};
            else map.put(numberArray[i], i);
        }
        return null;
    }

    /**
     * Given an array of sorted numbers and a target sum,
     * find a pair in the array whose sum is equal to the given target.
     *
     * Write a function to return the indices of the two numbers
     * (i.e. the pair) such that they add up to the given target.
     *
     */
    private int[] pairWithTargetSum(int[] numbers, int target){
        int startIndex = 0;
        int endIndex = numbers.length-1;

        if (numbers.length == 0) return new int[] {-1,-1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[startIndex] + numbers[endIndex] == target) return new int[]{startIndex, endIndex};
            else if (numbers[startIndex] + numbers[endIndex] > target)  endIndex -= 1;
            else startIndex += 1 ;
        }
        return new int[] {-1,-1};
    }


    /**
     * Problem Statement
     * Given an array of sorted numbers, remove all duplicates from it.
     * You should not use any extra space;
     * after removing the duplicates in-place return the new length of the array
     **/
    private static int removeDuplicate(int[] numberArray){
        if (numberArray.length == 0 ) return 0;
        int index = 1;
        int nextIndex = 1;
        while(index < numberArray.length){
            if(numberArray[nextIndex  - 1] != numberArray[index]){
                numberArray[nextIndex] = numberArray[index];
                nextIndex++;
            }
            index++;
        }
        return nextIndex;
    }

    @Test
    void TestRemoveDuplicate(){
        int expected = 4;
        int actual = new TwoSum().removeDuplicate(new int[] {2, 3, 3, 3, 6, 9, 9});
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(0, new TwoSum().removeDuplicate(new int[] {}));

    }

    @Test
    void testPairWithTargetSum(){
        int[] expected = new int[]{5, 6};
        int[] actual = new TwoSum().pairWithTargetSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 13);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
        Assertions.assertEquals(
                Arrays.toString(new int[]{-1, -1}),
                Arrays.toString(new TwoSum().pairWithTargetSum(new int[]{}, 13)));
    }


    private List<String> getMatchString(String statement){
        if (statement.isEmpty()) return null;
        return Arrays.stream(statement.split(" "))
                .filter(word -> word.matches("[Pp]ython\\W?"))
                .map(w -> w.replace(",", ""))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    @Test
    void testGetPythonFromStatement(){
        String statement = "I am learning Python, for python is a good programming language";
        List<String> expected = List.of("Python", "python");
        List<String> actual = new TwoSum().getMatchString(statement);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, actual),
                () -> Assertions.assertNull(new TwoSum().getMatchString(""))
        );
    }

    /**
     *
     * Given a list of +ve and -ve numbers
     * Find the number that's closest to zero
     */
    private int findTemperature(int[] arr){

        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[0];

        int closestToZero = 0;

        for (int j : arr) {
            if (closestToZero == 0) {
                closestToZero = j;
            } else if (j > 0 && j <= Math.abs(closestToZero)) {
                closestToZero = j;
            } else if (j < 0 && -j < Math.abs(closestToZero)) {
                closestToZero = j;
            }
        }
        return closestToZero;

    }

    @Test
    void testFindTemperature(){

        Assertions.assertAll(
                () -> assertEquals(0, findTemperature(new int[]{})),
                () -> assertEquals(45, findTemperature(new int[]{45})),
                () -> assertEquals(1, findTemperature(new int[]{1, 10, 100, -30}))
        );
    }
}
