package Easy;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
LeetCode 26
Company: Amazon
Difficulty: Easy

Pattern:
- Two Pointers

Time: O(n)
Space: O(1)

Key Idea:
Maintain the index of the last unique element.

*/

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        for (int j = 1; j < nums.length; j++) {
            if(nums[i]==nums[j]){
                continue;
            }else{
                nums[++i]=nums[j];
            }
        }
        return i+1;

    }
}