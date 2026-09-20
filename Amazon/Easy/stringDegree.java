class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int reversePosition = 26 - (s.charAt(i) - 'a');
            int stringPosition = i + 1;

            ans += reversePosition * stringPosition;
        }

        return ans;
    }
}