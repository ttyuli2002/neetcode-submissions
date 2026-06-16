class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] mp = new int[256];
        int l = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char rChar = s.charAt(i);
            while (mp[rChar] > 0) {
                char lChar = s.charAt(l);
                mp[lChar]--;
                l++;
            }

            mp[rChar]++;
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}
