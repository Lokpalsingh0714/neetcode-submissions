class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int max_sum=0;
        while(i<=j){
            int sum=Math.min(arr[i],arr[j])*(j-i);
            if(sum>max_sum){
                max_sum=sum;
            }
            if(arr[i]>arr[j]){
                j--;
            }
            else
                i++;
        }
        return max_sum;
    }
}
