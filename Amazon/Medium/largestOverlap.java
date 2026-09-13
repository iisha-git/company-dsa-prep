
import java.util.*;

/*
 * LeetCode 835 - Image Overlap
 * https://leetcode.com/problems/image-overlap/
 *
 * Approach:
 * - Store the coordinates of all 1s in both images.
 * - Compare every 1 in img1 with every 1 in img2.
 * - The row and column differences represent a possible translation.
 * - Count how many pairs produce the same translation.
 * - The translation with the highest count gives the maximum overlap.
 *
 * Time: O(n^4)
 * Space: O(n^2)
 */

public class largestOverlap {
    public int largestOverlap(int[][] img1, int[][] img2) {

        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;

        List<int[]> ones1 = new ArrayList<>();
        List<int[]> ones2 = new ArrayList<>();

        for(int i = 0; i < img1.length; i++){
            for(int j = 0; j < img1.length; j++){
                if(img1[i][j] == 1){
                    ones1.add(new int[]{i, j});
                }
            }
        }

        for(int i = 0; i < img2.length; i++){
            for(int j = 0; j < img2.length; j++){
                if(img2[i][j] == 1){
                    ones2.add(new int[]{i, j});
                }
            }
        }

        for(int[] p1 : ones1){
            for(int[] p2 : ones2){
                int rowDiff = p2[0] - p1[0];
                int colDiff = p2[1] - p1[1];

                String key = rowDiff + "," + colDiff;

                int newCount = map.getOrDefault(key, 0) + 1;
                map.put(key, newCount);

                max = Math.max(max, newCount);
            }
        }

        return max;
    }
}