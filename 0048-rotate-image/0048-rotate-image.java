class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length ;
        int[] arr = new int[n*n];
        int x = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[x++] = matrix[i][j];
            }
        }
        x =0;

        for(int j = n-1 ; j>=0 ; j--){
            for(int i = 0 ; i < n; i++){
                matrix[i][j] = arr[x++];
            }
        }
    }
}