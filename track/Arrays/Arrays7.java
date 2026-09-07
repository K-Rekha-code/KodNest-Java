public class Main {
    public static void main(String[] args) {
        int[] marks = {70, 80, 60, 90, 50};
        
        int total = 0;
        
        // Loop through the array to sum the marks
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        
        // Calculate average using double division
        double average = (double) total / marks.length;
        
        // Print total and average
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}