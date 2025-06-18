class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        Map <Integer, Integer> map = new HashMap<>();
        // frequency map
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], (map.getOrDefault(nums[i] , 0)+1));
        }

        for(int key: map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){

                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }
        int count = 0;
        int[] ans = new int[k];

        for(int i = bucket.length-1 ; i>= 0 && count<k ; i--){
            if(bucket[i] != null){
                for(int x : bucket[i]){
                    ans[count++]  = x;
                    if(count == k) break;
                }
            }
        }
        return ans;
    }
}