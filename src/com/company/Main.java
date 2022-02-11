package com.company;

import java.time.Month;
import java.time.temporal.IsoFields;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        String str = "116161";
        String str2 = str.replaceAll("6", "3");

        System.out.println(str2);



//        System.out.println(quarterOf(3));
//        System.out.println( getInitialsOfName("Aaron Mackson"));

//        System.out.println(dutyFree(10,10,500));
//        System.out.println(dutyFree(12,50,1000));
//        System.out.println(dutyFree(17,10,500));// fails
//        System.out.println(dutyFree(24,35,3000));
//        System.out.println(dutyFree(1400,35,10000));

//        System.out.println(correct("1F-RUDYARD K1PL1NG"));
//        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));

//        int[] n  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        System.out.println(createPhoneNumber(n));


    }

// add lists of integers return even if sum of list is even else odd
     static String evenOrOdd(int[] array) {

        int result = Arrays.stream(array).reduce(0, (a,b)-> a+b);
        String less = result % 2 ==0 ? "even": "odd";
//        String more  = Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";  // method two
        return  less;
    }




    static String goodBad(String[] x){
        String realState = "";
        int nGood = (int) Arrays.stream(x)
                .filter(f->f.contains("good"))
                .count();

       switch (nGood){
           case 1: case 2:  realState = "Publish!"; break;
           case 3:  realState = "I smell a series!"; break;
           default: realState = "Fail!"; break;
       }
       return realState;
    }



    static int bitCounter(int n){
        int count = 0;
        char[] t = Integer.toBinaryString(n).toCharArray();
        for(char el: t){
            if(el=='1')  count++;
        }
    return count;
    }



// couldn't order it as required
    public static void solve(int [] arr){
         Arrays.stream(Arrays
                .stream(arr).distinct().toArray()).forEach(System.out::println);
    }

//    finds the quarter of a month.
    public static int quarterOf(int month) {
        return Month.of(month).get(IsoFields.QUARTER_OF_YEAR);
    }




    public static String getInitialsOfName(String name){
        return  name.split(" ")[0].substring(0,1).toUpperCase() + "." +
                name.split(" ")[1].substring(0,1).toUpperCase();
    }



    public static int dutyFree(int normPrice, int discount, int hol) {
        int savings = (normPrice * discount) / 100;
        return hol /savings;
    }



    static String correct(String str){
        StringBuilder sbf = new StringBuilder();
         Arrays.stream(Stream.of(str)
                 .map(replaceOneWithI -> replaceOneWithI.replaceAll("[1]", "I"))
                 .map(replaceFiveWithS -> replaceFiveWithS.replaceAll("[5]", "S"))
                 .map(replaceZeroWithO -> replaceZeroWithO.replaceAll("[0]", "O"))
                 .toArray()).forEach(sbf::append);
//         Method 2
        str.replaceAll("5","S")
                .replaceAll("0","O")
                .replaceAll("1","I");
        return sbf.toString();
    }



    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sbf = new StringBuilder();
       for(int i: numbers){
           sbf.append(i);
          }
       return "(" + sbf.substring(0,3) + ") "  + sbf.substring(3,6) + "-" + sbf.substring(6,10);
    }





}
