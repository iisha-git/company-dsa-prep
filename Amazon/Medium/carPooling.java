
/*
 * LeetCode 1094 - Car Pooling
 * https://leetcode.com/problems/car-pooling/
 *
 * Approach:
 * - Use a difference array to record passenger changes at each location.
 * - Add passengers at the pickup location.
 * - Remove passengers at the drop-off location.
 * - Traverse the change array and maintain current passengers.
 * - If passengers ever exceed capacity, return false.
 *
 * Time: O(n + 1001) -> O(n)
 * Space: O(1001) -> O(1)
 */

public class carPooling {
    public boolean carPooling(int[][] trips, int capacity) {

        int[] change = new int[1001];

        for(int i = 0; i < trips.length; i++){
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            change[from] += passengers;
            change[to] -= passengers;
        }

        int currentPop = 0;

        for(int i = 0; i < change.length; i++){
            currentPop += change[i];

            if(currentPop > capacity){
                return false;
            }
        }

        return true;
    }
}