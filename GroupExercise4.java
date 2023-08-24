package Group6;

public class GroupExercise4 {
    public static void main(String[] args) {
        // 4. Create a 2D array of integers. Develop a program which will calculate
        // the sum of even and odd numbers for that array.

        int[][] numbers = {
                {82, 79, 80, 81, 94},
                {87, 86, 33, 189, 65},
                {15, 30, 35, 45, 77},
                {16, 26, 36, 46, 8}
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    evenSum += numbers[row][col];
                } else {
                    oddSum += numbers[row][col];
                }
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}