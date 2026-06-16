class Solution {
    public int maxProfit(int[] prices) {
        int mnP = prices[0];
        int re = 0;
        for (int p: prices) {
            if (p > mnP) {
                re = Math.max(re, p - mnP);
            }
            mnP = Math.min(mnP, p);
        }
        return re;
    }
}
