class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (hMap.containsKey(n)) {
                return new int[]{hMap.get(n), i};
            }
        
            hMap.put(target - n, i);
        }

        return new int[]{0, 0};
    }
}
