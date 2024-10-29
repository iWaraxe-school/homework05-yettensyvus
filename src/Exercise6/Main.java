package Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList to hold random numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        // Generate 10 random numbers between 1 and 99 and add them to the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100)); // Random number between 1 and 99
        }

        // Print the original list of random numbers
        System.out.println("Original list of random numbers: " + numbers);

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("List after sorting in descending order: " + numbers);

        // Shuffle the list randomly
        Collections.shuffle(numbers);
        System.out.println("List after shuffling: " + numbers);
    }
}
