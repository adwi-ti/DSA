class Solution {
    public int[][] merge(int[][] intervals) {
         ArrayList <int[]> arr = new ArrayList<>();

         Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
         int l = intervals[0][0];
         int r = intervals[0][1];

         for(int i = 0 ; i < n ; i++){
            if(intervals[i][0] <= r ){
                r = Math.max(r,intervals[i][1]);
            }

            else{
                arr.add(new int[]{l,r});
                l = intervals[i][0];
                r = intervals[i][1];
            }
         }
         arr.add(new int[]{l,r});
         

         return arr.toArray(new int[0][]);
    }
}