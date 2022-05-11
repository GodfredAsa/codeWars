package QueuePrinciple;
import java.util.ArrayList;
import java.util.List;

public class QueueImp implements IQueue{
    List<String> listsOfItems = new ArrayList<>();
    @Override
    public String enque(String str) {
        if(str.trim().equals("")) return str.toUpperCase() + " item not added";
        listsOfItems.add(0, str);
        return str.toUpperCase() + " successfully added";
    }

    @Override
    public void deque(String str) {
        listsOfItems.add(str);
    }

    @Override
    public void peek() {
        System.out.println(listsOfItems.get(listsOfItems.size()-1));
    }

    public List<String> getListsOfItems() {
        return listsOfItems;
    }

    public static void main(String[] args) {
        QueueImp queueImp = new QueueImp();
        queueImp.enque("tomatoes");
        queueImp.enque("potato");
        queueImp.deque("pepper");
        queueImp.enque("fred");
        queueImp.enque("stolen");
        queueImp.deque("knife");
        queueImp.deque("greener");

        System.out.println(queueImp.enque(" "));

        System.out.println(queueImp.getListsOfItems());
        queueImp.peek();

        System.out.println(getE_levy(1000));
        System.out.println(getE_levy(500));


    }

    private static double getE_levy(int transaction){
        double e_levy, difference;
        double costOfLevy = 1.5 /100;
        if(transaction <= 100) e_levy = 0.0;
        else{
            difference = transaction-100;
            e_levy = costOfLevy * difference + (0.01 * difference) ;
        }
        return e_levy;
    }
}
