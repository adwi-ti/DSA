class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int srow = 0;
        int scol = 0; 
        int erow = matrix.length -1;
        int ecol = matrix[0].length - 1 ;

        while(srow <= erow && scol <= ecol){
            //top
            for(int j = scol; j <= ecol ; j++){
                list.add(matrix[srow][j]);
            }
            //right
            for(int i = srow + 1; i <= erow ; i++){
                list.add(matrix[i][ecol]);
            }
            //bottom
            for(int j = ecol-1; j >= scol ; j--){
                if(srow == erow) break;
                list.add(matrix[erow][j]);
            }
            //left
            for(int i = erow-1; i >= srow + 1 ; i--){
                if(scol == ecol) break;
                list.add(matrix[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return list;
    }
}