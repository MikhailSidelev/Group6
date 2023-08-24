package Group6;

public class GroupExercise3 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even
        //numbers only.

        int[][] numbers ={{82, 79, 80, 81, 94,},
                          {87, 86, 33, 189, 65},
                          {15, 30, 35,45,77},
                          {16, 26, 36, 46,8}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) { //numbers[row] =>gives us complete 1D array
                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");

                }
            }
            System.out.println();

        }

    }
}