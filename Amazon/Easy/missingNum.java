package Easy;

/*
leetcode : https://leetcode.com/problems/missing-number
268 - Missing Number
Company: Google
Difficulty: Easy

Concept:
The array contains numbers from 0 to n with exactly one number missing.

- Calculate the sum of all numbers that SHOULD be present.
- Calculate the sum of all numbers ACTUALLY present in nums.
- The difference between the two sums is the missing number.

Expected:
0 + 1 + 2 + ... + n
= n * (n + 1) / 2

Actual:
Sum of all elements in nums.

Missing:
Expected - Actual

Key idea:
When a problem gives a complete numerical range with exactly
one missing value, compare the expected total with the actual total.

Time: O(n)
Space: O(1)
*/
public class missingNum {
    public int missingNumber(int[] nums) {
        /*
        Arrays.sort(nums);
        int n = nums.length-1;
        for(int i =0;i<n;i++){
            if(nums[i+1]-nums[i]!=1){
                return nums[i]+1;
            }
        }

        if(nums[0]!=0) return 0;
        return nums[n]+1;
    }
         */
         int n = nums.length;
         int expected = (n*(n+1))/2;
         int actual = 0;
         for(int i : nums){
            actual = actual+i;
         }
         return expected - actual;
    }
}
