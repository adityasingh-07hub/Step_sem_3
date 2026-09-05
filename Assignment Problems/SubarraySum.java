import java.util.*;

public class SubarraySum {

    // Counts number of subarrays whose sum equals k
    static int subarraySum(int nums[], int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        // Empty prefix sum
        map.put(0,1);

        int prefixSum = 0;

        int count = 0;

        for(int num : nums) {

            // Calculate running prefix sum
            prefixSum += num;

            // Check if previous prefix exists
            if(map.containsKey(prefixSum-k)) {

                count += map.get(prefixSum-k);
            }

            // Store frequency of prefix sum
            map.put(prefixSum,
                    map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }

    public static void main(String args[]) {

        int nums[] = {1,1,1};

        int k = 2;

        System.out.println(
                "Number of subarrays = "
                + subarraySum(nums,k)
        );
    }
}