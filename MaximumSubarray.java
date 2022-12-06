/* Returns the maximum value of the subarray which yields the largest sum
 * O(n) time
 * O(1) space
 */
 

class Solution {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        return max;
    }



    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {-1,-2,-3,-4,0};
        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
    }
}