class Solution {
    public boolean isAnagram(String s, String t) {
        int[] numS = new int[26];
        for (char i: s.toCharArray()) {
            numS[i - 'a']++;
        }

        for (char i: t.toCharArray()) {
            numS[i - 'a']--;
            if (numS[i - 'a'] < 0) return false;
        }

        for (int i: numS) {
            if (i != 0) return false;
        }
        return true;
    }
}
