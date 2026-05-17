class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hMap = new HashMap<>();

        for (String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            hMap.putIfAbsent(key, new ArrayList<>());
            hMap.get(key).add(str);
        }

        return new ArrayList<>(hMap.values());
    }
}
