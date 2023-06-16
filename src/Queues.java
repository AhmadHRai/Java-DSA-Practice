import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //  Queue = FIFO data structure. First-In First-Out (ex. A line of people).
        //      A collection designed for holding elements prior to processing Linear Data Structure.

        // Add = enqueue, offer()
        // Remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>(); // queue is an interface


        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");


//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.contains("Karen"));
//        System.out.println(queue.peek()); //First Item
//        queue.poll(); //removes from the top

        System.out.println(queue);

        // Where are queues useful?
        //  1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        //  2. Printer Queue (Print jobs should be completed in order)
        //  3. Used in LinkedLists, PriorityQueues, Breadth-first search
    }
}
