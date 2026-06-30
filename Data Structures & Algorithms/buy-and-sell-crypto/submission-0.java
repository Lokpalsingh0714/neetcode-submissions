class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int min_price=arr[0];
        int max_profit=0;
        for(int i=0;i<n;i++){  
            int profit= arr[i]-min_price;
            if(profit>max_profit){
                max_profit=profit;
            }
            if(arr[i]<min_price) min_price=arr[i];
        }
        return max_profit;
    }
}
