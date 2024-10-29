package Exercise2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Create a HashSet to store book titles
        HashSet<String> bookTitles = new HashSet<>();

        // Add book titles, including some duplicates
        bookTitles.add("Anna Karenina");
        bookTitles.add("Madame Bovary");
        bookTitles.add("War and Peace");
        bookTitles.add("The Great Gatsby");
        bookTitles.add("Lolita");

        // Adding duplicate titles
        bookTitles.add("Madame Bovary");
        bookTitles.add("Lolita");

        // Print out the contents of the HashSet
        System.out.println("Unique book titles:");
        for (String title : bookTitles) {
            System.out.println(title);
        }
    }
}
