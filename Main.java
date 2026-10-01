import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Smallest: " + numbers.peek());

        System.out.println("Removing: " + numbers.poll());
        System.out.println("Removing: " + numbers.poll());
    }
}