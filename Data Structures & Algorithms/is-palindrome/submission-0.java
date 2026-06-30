class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                 sb.append(ch);
                 }
        }
        String str=sb.toString();
        sb.reverse();
        return (sb.toString().equals(str));
    }
}
