package Exercise3;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap to store student names as keys and their grades as values
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add student names and their corresponding grades
        studentGrades.put("Alex", 85);
        studentGrades.put("Sorin", 92);
        studentGrades.put("Mihai", 88);
        studentGrades.put("Florin", 95);
        studentGrades.put("Nicolae", 78);
        studentGrades.put("Dumitru", 91);

        // Display students who scored above 90
        System.out.println("Students who scored above 90:");
        for (String student : studentGrades.keySet()) {
            int grade = studentGrades.get(student);
            if (grade > 90) { // Check if the grade is above 90
                System.out.println(student + ": " + grade);
            }
        }
    }
}
