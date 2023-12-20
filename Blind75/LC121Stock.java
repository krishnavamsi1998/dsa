//O(n),O(1)
//neetcode
class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxP=0;
        
        while(r<prices.length)
        {
            //chance of profit
            if(prices[l]<prices[r])
            {
                int profit=prices[r]-prices[l];
                if(profit>maxP)
                    maxP=profit;
                
            }
            //no profit
            else
            {
                l=r;
            }
            r++;
        }
        return maxP;
    }
}
