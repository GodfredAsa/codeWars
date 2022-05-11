package CODEWARS.Challenge;

public class Submarine {

    private int depth;

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getMeasurement(int number){

        if(number == 199){
            setDepth(number);
            return  getDepth() + "(N/A - no previous measurement)";
        }
        else if(number > getDepth()){
            setDepth(number);
            return number + " Increased";
        }else{
            setDepth(number);
            return  getDepth() + " Decreased";
        }
    }

}
