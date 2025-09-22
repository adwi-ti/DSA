class Solution {
    public int maxSubArray(int[] nums) {
         int ms = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        int flag = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0 ) flag++;
            sum += nums[i];
            if(sum < 0) sum = 0;
            ms = Math.max(sum, ms);
        }
        if(flag ==0){
            Arrays.sort(nums);
            ms = nums[n-1];
        }
        return ms;
    }
}