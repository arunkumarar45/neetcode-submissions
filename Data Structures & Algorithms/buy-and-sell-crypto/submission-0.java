class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=Integer.MAX_VALUE;
        for(int price:prices){
            if(buy>price){
                buy=price;
            }
            else{
              int profit=price-buy;
              maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
}
