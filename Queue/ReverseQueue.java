package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) {
            return;
        }

        T element = queue.poll();
        reverseQueue(queue);
        queue.add(element);
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        System.out.println("Original Queue: " + myQueue);
        reverseQueue(myQueue);
        System.out.println("Reversed Queue: " + myQueue);

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("A");
        stringQueue.add("B");
        stringQueue.add("C");
        System.out.println("Original String Queue: " + stringQueue);
        reverseQueue(stringQueue);
        System.out.println("Reversed String Queue: " + stringQueue);
    }
}
