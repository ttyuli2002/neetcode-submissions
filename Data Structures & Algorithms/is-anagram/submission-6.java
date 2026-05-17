class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            hMap.put(c, hMap.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            if (hMap.getOrDefault(c, 0) <= 0) {
                return false;
            }
            hMap.put(c, hMap.get(c) - 1);
        }

        for (int x: hMap.values()) {
            if (x != 0) return false;
        }
        return true;
    }
}
