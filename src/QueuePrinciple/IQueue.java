package QueuePrinciple;

public interface IQueue {
    String enque(String str); // adding to the first position
    void deque(String str); // adding to the last position
    void peek(); // get the element at the last position

}
