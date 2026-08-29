/*
 * LeetCode 2104 - Sum of Subarray Ranges
 * https://leetcode.com/problems/sum-of-subarray-ranges/
 *
 * Approach:
 * - Consider every possible subarray using two loops.
 * - For each starting index, extend the subarray using j.
 * - Keep track of the minimum and maximum value in the current subarray.
 * - Add (max - min) to the total answer.
 *
 * Time: O(n^2)
 * Space: O(1)
 */

class subArrayRanges {
    public long subArrayRanges(int[] nums) {
        long answer = 0 ;
        for(int i =0 ; i<nums.length;i++){
            int minVal = nums[i];
            int maxVal = nums[i];
            for(int j = i; j<nums.length ; j++){
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                answer += maxVal-minVal;
            }
        }
        return answer;
    }
}