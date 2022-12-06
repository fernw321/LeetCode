/* Returns whether or not a given integer array contains duplicates
* O(n) time
* O(n) space
*/

import java.util.*;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        // Set contains only unique elements
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            // Set.add returns a truthy value if a new element is successfully added
            if (!set1.add(nums[i])) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 2, 3};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));

    }
}