package trial;
import java.util.Arrays;

public class ExerciseTwo {

    public static void main(String[] args) {

        System.out.println(getFloor("(())"));
        System.out.println(getFloor("()()"));
        System.out.println(getFloor("(()(()("));
        System.out.println(getFloor(")())())"));
        System.out.println(getArea("2x3x4"));
        System.out.println(getArea("4x23x21"));

       int[] numbers  =  new int[]{1,2,3,4,5};
        System.out.println( "items "  + numbers[0]);

        System.out.println("string trials => " + getString("I love coding"));
    }

    /*
     *  private static int getFloor(String str){
     *         int initialCounter = 0;
     *         for (int i = 0; i < str.length(); i++) {
     *             if (str.charAt(i) == '(') {
     *                 initialCounter++;
     *             }else {
     *                 initialCounter--;
     *             }
     *         }
     *           return initialCounter;
     *     }
     */

//    private static int getFloor(String str){
//        return Arrays.stream(str.split(""))
//                .mapToInt(parent -> {
//                    int floor = 0;
//                    if(parent.charAt(0) == '(') floor++;
//                    else floor--;
//                    return floor;
//                }).reduce(0, Integer::sum);
//    }


// https://adventofcode.com/2015/day/2
    private  static int getArea(String str){
        int[] dimensions = Arrays
                .stream(str.split("x"))
                .mapToInt(Integer::parseInt).toArray();

        int total;
        int smallestArea;

        int l = dimensions[0];
        int w = dimensions[1];
        int h = dimensions[2];

        int firstArea = l*w;
        int secondArea = w*h;
        int thirdArea =  h*l ;

        total  = 2 * (firstArea + secondArea + thirdArea);

        if(firstArea < secondArea && firstArea < thirdArea){
            smallestArea = firstArea;
        }else if(secondArea < firstArea && secondArea < thirdArea)
            smallestArea = firstArea;
        else{
            smallestArea = thirdArea;
        }

        System.out.println( "smallest area: "+ smallestArea);
        return total + smallestArea;
    }

    private static int getFloor(String str){
        int counter = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                counter++;
            }else{
                counter--;
            }
        }
        return counter;
    }

    private static String getString(String str){
        StringBuilder sbf = new StringBuilder();
        String[] stringArray = str.split(" ");
        for (int i = 0; i <stringArray.length ; i++) {
           if(i == stringArray.length-2) {
               sbf.append(stringArray[i]).append(" ");
           }
        }
        return  sbf.toString();
    }
}
