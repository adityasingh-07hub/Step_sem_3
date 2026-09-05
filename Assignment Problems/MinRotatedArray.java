public class MinRotatedArray {


    // Binary search approach
    static int findMin(int nums[]) {

        int left = 0;

        int right = nums.length-1;

        while(left < right) {

            // Find middle index
            int mid = left + (right-left)/2;


            // Minimum lies on right side
            if(nums[mid] > nums[right]) {

                left = mid + 1;
            }

            // Minimum lies on left side including mid
            else {

                right = mid;
            }
        }

        // left and right point to minimum element
        return nums[left];
    }

    public static void main(String args[]) {

        int nums[] = {3,4,5,1,2};

        System.out.println(
                "Minimum element = "
                + findMin(nums)
        );
    }
}