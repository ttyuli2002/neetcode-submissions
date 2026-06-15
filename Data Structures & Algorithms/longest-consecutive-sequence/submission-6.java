class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for (int num: nums) {
            hSet.add(num);
        }

        int longest = 0;
        for (int num: hSet) {
            if (!hSet.contains(num - 1)) {
                int curr = num;
                int len = 1;
                while (hSet.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
