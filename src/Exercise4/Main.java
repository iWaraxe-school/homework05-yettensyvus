package Exercise4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Create a LinkedList to use as a queue for book titles
        Queue<String> bookQueue = new LinkedList<>();

        // Enqueue (add) five book titles
        bookQueue.add("Anna Karenina");
        bookQueue.add("Madame Bovary");
        bookQueue.add("War and Peace");
        bookQueue.add("The Great Gatsby");
        bookQueue.add("Lolita");
        System.out.println("Queue after enqueuing 5 book titles: " + bookQueue);

        // Dequeue (remove) two book titles
        bookQueue.poll(); // Removes the first book title
        System.out.println("Queue after dequeuing 1 book title: " + bookQueue);

        bookQueue.poll(); // Removes the next book title
        System.out.println("Queue after dequeuing another book title: " + bookQueue);

        // Enqueue three more book titles
        bookQueue.add("Moby Dick");
        bookQueue.add("The Catcher in the Rye");
        bookQueue.add("The Hobbit");
        System.out.println("Queue after enqueuing 3 more book titles: " + bookQueue);
    }
}
