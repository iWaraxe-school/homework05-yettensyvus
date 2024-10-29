package Exercise1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList to store Integer values
        ArrayList<Integer> numbers = new ArrayList<>();

        // Instantiate the Random class to generate random numbers
        Random rand = new Random();

        // Populate the ArrayList with 10 random numbers between 0 and 99
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100)); // Random number between 0 and 99
        }

        // Print out all numbers at even indices
        System.out.println("Numbers at even indices:");
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) { // Check if the index is even
                System.out.println("Index " + i + ": " + numbers.get(i));
            }
        }
    }
}