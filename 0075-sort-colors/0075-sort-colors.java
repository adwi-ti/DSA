class Solution {
    public void swap(int[] arr ,int a , int b){
        int temp = arr[a] ; 
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortColors(int[] nums) {
        int i = 0;
        int l = 0 ;
        int r = nums.length -1;


        while(i <= r){
            if(nums[i] == 0){
                swap(nums, i, l);
                i++;
                l++;
            }

            else if(nums[i] == 2){
                swap(nums, i , r);
                r--;
            }

            else i++;
        }
    }
}