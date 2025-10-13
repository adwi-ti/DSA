class Solution {
    
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transpose = new int[m][n];

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j =0 ; j < matrix[0].length ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}