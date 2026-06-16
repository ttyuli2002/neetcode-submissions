class Solution {
    public int maxProfit(int[] prices) {
        int mnP = prices[0];
        int mxProfit = 0;
        for (int p: prices) {
            if (p > mnP) {
                mxProfit = Math.max(mxProfit, p - mnP);
            }
            mnP = Math.min(mnP, p);
        }
        return mxProfit;
    }
}
