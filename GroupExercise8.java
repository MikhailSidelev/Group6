package Group6;

public class GroupExercise8 {
    public static void main(String[] args) {
        int n = 10;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i] + "");
        }

        int max = fibonacci[0];
        int min = fibonacci[0];

        for (int i = 1; i < n; i++) {
            if (fibonacci[i] > max) {
                max = fibonacci[i];
            }
            if (fibonacci[i] < min) {
                min = fibonacci[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

    }


