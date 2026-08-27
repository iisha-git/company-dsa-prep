/*
 * LeetCode 1046 - Last Stone Weight
 * https://leetcode.com/problems/last-stone-weight/
 *
 * Pattern: Max Heap / Priority Queue
 *
 * - Put all stones into a Max Heap.
 * - poll() gives the two largest stones.
 * - Smash them and calculate their difference.
 * - If the difference > 0, add it back to the heap.
 * - Repeat until at most one stone remains.
 *
 * Time: O(n log n)
 * Space: O(n)
 */

import java.util.PriorityQueue;
import java.util.Collections;

public class lastStone {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int i : stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            int diff = first - second;

            if (diff > 0) {
                pq.add(diff);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}