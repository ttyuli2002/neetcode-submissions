class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i: nums) {
            hMap.put(i, hMap.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer>[] lst = new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            lst[i] = new ArrayList<>();
        }
        for (int key: hMap.keySet()) {
            lst[hMap.get(key)].add(key);
        }

        int[] result = new int[k];
        int idx = k - 1;
        for (int i = nums.length; i >= 0 && idx >= 0; i--) {
            if (lst[i].size() == 0) continue;

            for (int x: lst[i]) {
                result[idx--] = x;
                if (idx < 0) return result;
            }
        }
        return result;
    }
}
