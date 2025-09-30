class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n = nums.length;
        Set<List<Integer>> container = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            Set<Integer> s = new HashSet<>();
            for(int j = i+1;j< n ; j++){
                int tar = -(nums[i] + nums[j]);
                if(s.contains(tar)){
                    List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(tar);
                        Collections.sort(triplet);
                        container.add(triplet);
                }
                s.add(nums[j]);
                        
                
            }
        }

        return new ArrayList<>(container); 
    }
}