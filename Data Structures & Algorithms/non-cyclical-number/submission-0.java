class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getsum(n);
        }
        return n==1;
    }
     int getsum(int n){
        int sum=0;
        while(n>0){
            int digits=n%10;
            sum+=digits*digits;
            n /=10;
        }
        return sum;
    }
}
