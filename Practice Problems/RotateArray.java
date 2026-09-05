import java.util.Arrays;

public class RotateArray {

    // Method rotates array to the right by k positions
    static int[] rotateArray(int nums[], int k) {

        int n = nums.length;

        // Handle rotations greater than array size
        k = k % n;

        // Create new array
        int rotated[] = new int[n];

        // Place every element at its new position
        for(int i = 0; i < n; i++) {

            // Calculate new index after rotation
            int newIndex = (i + k) % n;

            rotated[newIndex] = nums[i];
        }

        return rotated;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7};

        int k = 3;

        int result[] = rotateArray(nums,k);

        System.out.println(
                Arrays.toString(result)
        );
    }
}