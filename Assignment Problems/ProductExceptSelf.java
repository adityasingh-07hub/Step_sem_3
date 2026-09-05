import java.util.*;

public class ProductExceptSelf {

    // Method to find product of all elements except current index
    // No division is used
    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        // Output array
        int[] answer = new int[n];

        // Store product of all elements on the left side
        answer[0] = 1;

        for(int i = 1; i < n; i++) {

            answer[i] = answer[i-1] * nums[i-1];
        }

        // Store product of all elements on the right side
        int rightProduct = 1;

        for(int i = n-1; i >= 0; i--) {

            // Multiply left product with right product
            answer[i] = answer[i] * rightProduct;

            // Update right product
            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }

    public static void main(String args[]) {

        int nums[] = {1,2,3,4};
        int result[] = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
} 
