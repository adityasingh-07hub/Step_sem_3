import java.util.Arrays;

public class TwoSum {

    // Method returns indices of two numbers whose sum equals target
    static int[] twoSum(int[] nums, int target) {

        // Check every possible pair using nested loops
        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                // If pair sum equals target, return indices
                if(nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        // Return empty array if no pair found
        return new int[]{};
    }

    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};

        int target = 9;

        int result[] = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}