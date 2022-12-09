import java.util.*;

class Solution {

    // Brute force solution, O(n^2) time O(1) space

    // public int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     int[] ans = new int[2];
    //     for (int i = 0; i < n; i++) {
    //         int numToBeFound = target - nums[i];
    //         for (int j = i+1; j < n; j++) {
    //             if (nums[j] == numToBeFound) {
    //                 ans[0] = i;
    //                 ans[1] = j;
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // Optimized approach, O(n) time, O(n) space
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int n = nums.length;
        int numToBeFound;
        for (int i = 0; i < n; i++) {
            numToBeFound = target - nums[i];
            if (numsMap.containsKey(numToBeFound)) {
                return new int[] {numsMap.get(numToBeFound), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}