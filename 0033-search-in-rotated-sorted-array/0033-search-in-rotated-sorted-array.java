class Solution {

    public static int bs(int[]nums, int target){
        int l = 0;
        int r = nums.length -1;
        while(l<=r){
            int mid = (l+r)/2;
            
            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                r = mid-1;
            }
            if(target > nums[mid]){
                l = mid+1;
            }
        }


        return -1;
    }
    public int search(int[] nums, int target) {
        int x = 0 ;
        int n = nums.length;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] > nums[i]){
                x = i;
                break;
            }
        }
        int bs1 = bs(Arrays.copyOfRange(nums,0,x), target);
        if(bs1 != -1) return bs1;

        int bs2 = bs(Arrays.copyOfRange(nums,x,n), target);
        if(bs2 != -1) return x+bs2;
        
        return -1;
    }
}
