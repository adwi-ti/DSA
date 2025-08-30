class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i = 0; i < nums.length ; i++){
            ans[i] = nums[i];
        }
        int x = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            ans[x++] = nums[i];
        }
        return ans;
    }
}