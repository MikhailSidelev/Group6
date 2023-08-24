package Group6;

public class GroupExercise5 {
    public static void main(String[] args) {

            int[] nums = {44, 55};


            nums[0] = nums[0] + nums[1];
            nums[1] = nums[0] - nums[1];
            nums[0] = nums[0] - nums[1];

            System.out.println("After swapping:");
            System.out.println("First number: " + nums[0]);
            System.out.println("Second number: " + nums[1]);
        }
    }


