package Group6;

public class GroupExercise9 {
    public static void main(String[] args) {
        int[] temps = {82, 79, 80, 81, 94, 87, 86};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int temp : temps) {
            if (temp > largest) {
                secondLargest = largest;
                largest = temp;
            } else if (temp > secondLargest && temp < largest) {
                secondLargest = temp;
            }
        }

        System.out.println("Second largest number: " + secondLargest);
    }

    }


