
/*
 * LeetCode 658 - Find K Closest Elements
 * https://leetcode.com/problems/find-k-closest-elements/
 *
 * Approach:
 * - Consider every possible window of k elements.
 * - Calculate the total absolute difference from x for each window.
 * - Keep track of the window with the smallest difference.
 * - Return the k elements from the best window.
 *
 * Time: O(n * k)
 * Space: O(k)
 */

import java.util.*;

public class closestelement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int smallest = Integer.MAX_VALUE;
        int bestStart = 0;

        for(int start = 0; start <= arr.length - k; start++){
            int diff = 0;

            for(int i = start; i < start + k; i++){
                diff += Math.abs(arr[i] - x);
            }

            if(diff < smallest){
                smallest = diff;
                bestStart = start;
            }
        }

        List<Integer> answer = new ArrayList<>();

        for(int i = bestStart; i < bestStart + k; i++){
            answer.add(arr[i]);
        }

        return answer;
    }
}