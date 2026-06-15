class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 1;
        int[] result = new int[nums.length];
        for (int idx = 0; idx < nums.length; idx++) {
            result[idx] = i;
            i *= nums[idx];
        }

        i = 1;
        for (int idx = nums.length - 1; idx >= 0; idx--) {
            result[idx] *= i;
            i *= nums[idx];
        }
        return result;
    }
}  
