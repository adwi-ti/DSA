class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        int x = nums.length/2;
        for( int num : nums){
            if(map.get(num) > x) return num;
        }

        return -1;
    }
}