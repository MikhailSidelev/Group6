package Group6;

public class GroupExercise1 {
    public static void main(String[] args) {
        // Create a program that uses an array to store a list of temperatures for
        // a week, and then uses a loop to find the highest and lowest
        // temperature for the week.

        int[] temps = {82, 79, 80, 81, 94, 87, 86};
        int smallest = temps[0];
        int largest = temps[0];

        for (int temp : temps) {
            if (temp < smallest) {
                smallest = temp; // Update smallest if the current number is smaller
            }
            if (temp > largest) {
                largest = temp; // Update largest if the current number is larger
            }
        }

        System.out.println("Smallest temperature: " + smallest);
        System.out.println("Largest temperature: " + largest);

    }


}