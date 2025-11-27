class Solution {
    public boolean palindrome(int l , int r , String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            r--;
            l++;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0 ; 
        int r = s.length()-1;

        while(l<r){
            if(s.charAt(l)!= s.charAt(r)){
                return palindrome(l+1, r, s) || palindrome(l, r-1 , s);
            }

            l++;
            r--;
        }
        return true;


    }
}