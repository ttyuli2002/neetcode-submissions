class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hMap = new HashMap<>();
        for (String str: strs) {
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String key = new String(charStr);
            hMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(hMap.values());
    }
}
