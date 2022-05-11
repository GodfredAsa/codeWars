package com.company.DataStructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class LinkedListDemo {



    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();
        ArrayList<Integer> listNumber = new ArrayList<>();

        myList.add("Steve");
        myList.add("Carl");
        myList.add("Raj");
        myList.add("Stephen");
        myList.add("Fred");
        myList.add("Rick");


        myList.stream()
                .filter(f->f.contains("e") || f.contains("C"))
                .forEach( e -> listNumber.add( e.length()  ));

        System.out.println(listNumber);


///        System.out.println("This => " + computerToPhone("0789456123"));


//        computerToPhone("94561");
        System.out.println("---------------------------------------------------");
         System.out.println(maskify("5616"));
        System.out.println(maskify("4556364607935616"));
        System.out.println( maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println("---------------------------------------------------");


        System.out.println(makePassword("Keep Calm and Carry On")); //
        System.out.println(makePassword("Give me liberty or give me death"));
        System.out.println( "Empty: " + makePassword(" "));
    }

//    static String computerToPhone(String str){
//        char[] strChar =  str.toCharArray();
//        for ( int i =0; i < strChar.length; i++) {
//            if( strChar[i] == '7')
//            {strChar[i] = '1';}
//            else if(  strChar[i] == '8'){strChar[i] = '2';}
//            else if(  strChar[i] == '9'){strChar[i] = '3';}
//            else if(  strChar[i] == '1'){strChar[i] = '7';}
//            else if(  strChar[i] == '2'){strChar[i] = '8';}
//            else if(  strChar[i] == '3'){strChar[i] = '9';}
//        }
//        return  String.copyValueOf(strChar);
//
//
//    }
////      checks if length >= 4 and returns the string
//        checks if length is more than 4
//        extract the last 4 characters of the string
//        extract the remaining string
//        appends # if to sbf by the length of subStr
//        concat sbf and lastFour strings
    public static String maskify(String str) {
        String maskedValue;
        StringBuilder sbf = new StringBuilder();

        if(str.length()<=4){
            maskedValue =  str;
        }else{
            String lastFour = str.substring(str.length()-4);
            String subStr = str.substring(0,lastFour.length());
            sbf.append("#".repeat(subStr.length()));
           maskedValue =   sbf  + lastFour;
        }
        return maskedValue;
    }



     public static String makePassword(String phrase){
        String returnString = "";
        StringBuilder sbf = new StringBuilder();
        String[] str =  phrase.split(" ");

      for(String s: str){
          if(s.length()==0){
              returnString  = "";
          }else{
              sbf.append(s.charAt(0));
              String filteredString =  Arrays.stream(Stream.of(sbf).toArray())
                      .map(o -> o.toString().replaceAll("[oO]","0"))
                      .map(i-> i.replaceAll("[iI]","1"))
                      .map(t-> t.replaceAll("[sS]","5"))
                      .collect(Collectors.toList())
                      .toString();
              returnString =  filteredString.substring(1,filteredString.length()-1);
          }
      }


/*
                    //      Second Method 2
         return phrase.equals("") ? "" : Arrays.asList(phrase.split(" ")).stream()
                 .map(o -> o.substring(0,1)).collect(Collectors.joining(""))
                 .replaceAll("[oO]", "0")
                 .replaceAll("[iI]", "1")
               .replaceAll("[sS]", "5");

*/
      return returnString;
    }


}
