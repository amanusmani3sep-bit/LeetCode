class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        rev(matrix);
    }
    public void transpose(int[][] matrix){
        int row=0;
        int col=0;
        for(row=0;row<matrix.length;row++){
            for(col=row+1;col<matrix.length;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
    }
    public void rev(int[][] matrix){
        for(int row=0;row<matrix.length;row++){
            int i=0;
            int j=matrix.length-1;
            while(i<=j){
                int temp=matrix[row][i];
                matrix[row][i]=matrix[row][j];
                matrix[row][j]=temp;
                i++;
                j--;
            }
        }
    }
}