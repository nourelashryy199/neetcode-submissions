class Solution {
    public void rotate(int[][] matrix) {
        for(int row = 0; row < matrix.length / 2; row++){
            int oppositeRow = matrix.length - 1 - row;
            int[] temp = matrix[row];
            matrix[row] = matrix[oppositeRow];
            matrix[oppositeRow] = temp;
        }
        for(int row = 0; row < matrix.length; row++){
            for(int col = row + 1; col < matrix[0].length; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}
