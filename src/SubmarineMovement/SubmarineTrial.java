package SubmarineMovement;
import java.util.Arrays;
import java.util.function.Function;

public class SubmarineTrial {

    private int horizontalPosition = 0;
    private int depth = 0;

    public int position(String str) {
        String direction = str.split(" ")[0];
        int value = Integer.parseInt(str.split(" ")[1]);

        if(direction.equals("forward")){
            horizontalPosition += value;
            return horizontalPosition;
        }else {
            if(direction.equals("down")){
                depth += value;
            }else{
                depth -= value;
            }
            return depth;
        }
    }

    public static void main(String[] args) {
//        https://adventofcode.com/2021/day/2
        SubmarineTrial submarineTrial = new SubmarineTrial();
        System.out.println("forward " + submarineTrial.position("forward 8"));
        System.out.println("forward " + submarineTrial.position("forward 8"));
        System.out.println("down " + submarineTrial.position("down 8"));
        System.out.println("down " + submarineTrial.position("down 8"));
        System.out.println("up " + submarineTrial.position("up 8"));
        System.out.println("up " + submarineTrial.position("up 8"));

        System.out.println(getFrequency("+1,+1,-2"));

        getMeasurement("199\n" +
                "200\n" +
                "208\n" +
                "210\n" +
                "200\n" +
                "207\n" +
                "240\n" +
                "269\n" +
                "260\n" +
                "263");
    }

//  https://adventofcode.com/2018/day/1
    public static int getFrequency(String str){
        return Arrays.stream(str.split(","))
                .mapToInt(Integer::parseInt)
                .reduce(0,Integer::sum);
    }




//    https://adventofcode.com/2021/day/1
    private static String getMeasurement(String str){
        int counter = 0;
        String[] stringArray = str.split("\n");
        String res = "";
        for (int i = 1; i < stringArray.length ; i++) {
            res = Integer.parseInt(stringArray[i]) > Integer.parseInt(stringArray[i-1]) ? "increased" : "decreased";
            if(res.equals("increased")){
               counter++;
            }
            System.out.println(res);
        }
        System.out.println(counter);
        return res;
    }
}
