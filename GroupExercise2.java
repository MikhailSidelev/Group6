package Group6;

public class GroupExercise2 {
    public static void main(String[] args) {
        // Create an array of integer values. After the array is created, calculate
        // the sum of all stored elements in that array.

        int[] numbers = {82, 79, 80, 81, 94, 87, 86, 33, 189, 65, 34, 1, 5};
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num; // Add the current element to the sum
        }

        System.out.println("Sum of the elements: " + sum);
    }
}
