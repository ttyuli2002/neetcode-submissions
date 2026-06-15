class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for (int i: nums) {
            if (hSet.contains(i)) {
                return true;
            }

            hSet.add(i);
        }
        return false;
    }
}