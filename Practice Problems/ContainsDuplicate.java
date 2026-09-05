public class ContainsDuplicate {

    // Method checks whether array contains duplicate values
    static boolean containsDuplicate(int nums[]) {

        // Compare every element with every other element
        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                // Duplicate found
                if(nums[i] == nums[j]) {

                    return true;
                }
            }
        }

        // No duplicate found
        return false;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,1};

        System.out.println(
                containsDuplicate(nums)
        );
    }
}