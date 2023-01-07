class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    int minPrice = prices[0];
    for(int i=0; i<prices.length; i++){
      if(prices[i]<minPrice){
        minPrice = prices[i];
      }
      int newProfit = prices[i]-minPrice;
      if(newProfit > profit){
        profit = newProfit;
      }
    }
    return profit;
  }
}
