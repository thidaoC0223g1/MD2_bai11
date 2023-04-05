package test;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Dave");
        System.out.println("Queue contents: " + queue);
        String firstElement = queue.remove();
        System.out.println("Removed element: " + firstElement);
        System.out.println("Queue contents after removal: " + queue);
        queue.add("Eve");
        System.out.println("Queue contents after adding element: " + queue);

        if (queue.contains("Bob")) {
            System.out.println("Bob is in the queue");
        } else {
            System.out.println("Bob is not in the queue");
        }
        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);

        queue.clear();
        System.out.println("Queue contents after clearing: " + queue);
    }
}
