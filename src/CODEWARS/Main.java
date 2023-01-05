package CODEWARS;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        sumParts(new int[] {0, 1,2});


        System.out.println( "Sum All functions: " + sumAll(new int[]{1,2,3,4,5}));

        System.out.println("1 :" + isValidDayOfMonth("1"));
        System.out.println("11:" +isValidDayOfMonth("11"));
        System.out.println("01:" +isValidDayOfMonth("01"));
        System.out.println("28:" +isValidDayOfMonth("28"));
        System.out.println("29:" +isValidDayOfMonth("29"));



    }
    private static boolean isValidDayOfMonth(String dayOfMonth){
        Pattern datePattern =  Pattern.compile("^([1-9]|1[1-9]|2[0-8])$");
        return datePattern.matcher(dayOfMonth).matches();
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