public class MaxSubarray {

    // Method to find maximum sum of contiguous subarray
    static int maxSubArray(int nums[]) {

        // Current running sum
        int currentSum = nums[0];

        // Maximum sum found till now
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            // Decide whether to extend previous subarray
            // or start a new subarray
            currentSum = Math.max(nums[i],
                    currentSum + nums[i]);

            // Update maximum answer
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Maximum Sum = "
                + maxSubArray(nums));
    }
}