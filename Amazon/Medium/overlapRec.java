
/*
 * LeetCode 836 - Rectangle Overlap
 * https://leetcode.com/problems/rectangle-overlap/
 *
 * Approach:
 * - Find the width of the common area between the two rectangles.
 * - Find the height of the common area between the two rectangles.
 * - If both width and height are positive, the rectangles overlap.
 * - If either is 0 or negative, there is no positive-area overlap.
 *
 * Time: O(1)
 * Space: O(1)
 */

public class rectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int width = Math.min(rec1[2], rec2[2])
                  - Math.max(rec1[0], rec2[0]);

        int height = Math.min(rec1[3], rec2[3])
                   - Math.max(rec1[1], rec2[1]);

        return width > 0 && height > 0;
    }
}