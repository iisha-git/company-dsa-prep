package Easy;


/*
LeetCode 88 - Merge Sorted Array
Company: Amazon
Difficulty: Easy

Pattern: Two Pointers

Approach:
- nums1 has extra space at the end.
- Start from the BACK of both arrays.
- Compare the largest remaining elements.
- Put the larger element at position k.
- Move the corresponding pointer and k backward.
- If nums2 still has elements, copy them into nums1.
- Remaining nums1 elements are already in the correct position.

Pointers:
i = m - 1       -> last valid element of nums1
j = n - 1       -> last element of nums2
k = m + n - 1   -> last position of nums1

Time: O(m + n)
Space: O(1)

Key Takeaway:
Merge from the back to avoid overwriting unprocessed elements in nums1.
*/

public class mergeSortedArray {
    public void merge(int [] nums1,int m, int [] nums2 , int n){
        int i = m-1;
        int j = n-1;
        int k  = n+m-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
