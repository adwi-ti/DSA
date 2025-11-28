class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i = 0 ;
        int j = nums.size() -1;
        int c=0;
        Collections.sort(nums);
        while(i < j){
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                c = c + j - i;
                i++;
                
            }
            else{
                j--;
            }
        }

        return c;
    }
}