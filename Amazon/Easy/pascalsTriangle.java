package Easy;
import java.util.*;

public class pascalsTriangle {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i>=1){
                for (int j = 1; j < i; j++) {
                    List<Integer> previous = result.get(i-1);
                    row.add(previous.get(j-1)+previous.get(j));
                }
                row.add(1);
            }
            result.add(row);
        }

        return result;
    }
}

/*
LeetCode 118 - Pascal's Triangle
Company: Amazon
Difficulty: Easy

Pattern: Array / Simulation

Concept:
Build Pascal's Triangle row by row.

- Each row starts and ends with 1.
- Every middle element comes from the two elements directly
  above it in the previous row.
- The previous row is stored in result, so we can use it
  while constructing the current row.
- j represents an index in the previous row.
- previous.get(j - 1) + previous.get(j) gives the current
  middle element.

Example:
Previous: [1, 3, 3, 1]
Current:  [1, 4, 6, 4, 1]

1 + 3 = 4
3 + 3 = 6
3 + 1 = 4

Important:
The triangle looks like a tree, but the required output is
a List<List<Integer>>, so we construct it as nested lists.

Time: O(n²)
Space: O(n²) - output itself.
*/