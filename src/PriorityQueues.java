import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues
{
    public static void main(String[] args) {
        //  Priority Queue = A FIFO data structure that serves elements
        //  with the highest priorities first
        //  before elements with lower priority

        //  Strings in default order
        Queue<String> queue = new PriorityQueue<>();

        //  Strings in reverse order
        //  Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
