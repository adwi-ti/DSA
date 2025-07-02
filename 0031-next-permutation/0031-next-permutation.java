class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1 ;
        for(int i = nums.length -2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot!= -1){
            for(int i = nums.length -1 ; i >= 0 ; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        
        }
        }

        int l = pivot+1;
        int r = nums.length -1;
        

        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
            
        }
    }
}