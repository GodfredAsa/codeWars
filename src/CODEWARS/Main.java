package CODEWARS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sumParts(new int[] {0, 1,2});


        System.out.println( "Sum All functions: " + sumAll(new int[]{1,2,3,4,5}));


    }


    static int sumUp(int[] t) {
        return Arrays.stream(t).reduce(0,Integer::sum);
    }

    static int[] deleteFirst(int[] deleteT) {
        int[] newArray = new int[deleteT.length - 1];
        System.arraycopy(deleteT, 1, newArray, 0, deleteT.length - 1);
        return newArray;

    }

    public static int[] sumParts(int[] ls) {
        int[] newArray = new int[1];
        if (ls.length == 0) {
            newArray[0] = 0;
        } else {
            newArray = new int[ls.length + 1];
            for(int i = 0; i < ls.length; i++){
                for(int x : ls){
                    System.out.print(x);
                }
                System.out.print("\n");
                newArray[i] = sumUp(ls);
                ls = deleteFirst(ls);
            }
        }
        return newArray;
    }

// sums up array of numbers. if number is even adds one to the number
    static int sumAll(int[] arrayOfNumbers){
        return Arrays.stream(arrayOfNumbers)
                .map(ifEvenAddOne -> ifEvenAddOne % 2 ==0 ? ifEvenAddOne + 1: ifEvenAddOne)
                .reduce(0, Integer::sum);
    }

}