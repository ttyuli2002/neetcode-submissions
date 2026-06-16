class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int maxA = 0;
        while (i < j) {
            int tmpA = Math.min(heights[i], heights[j]) * (j - i);
            maxA = Math.max(maxA, tmpA);

            if (heights[i] > heights[j]) j--;
            else i++;
        }
        return maxA;
    }
}
