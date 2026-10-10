
class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char digit = board[row][col];

                if (digit == '.') {
                    continue;
                }
                int squareIndex = (row / 3) * 3 + (col / 3);
                if (rows[row].contains(digit) ||
                    columns[col].contains(digit) ||
                    squares[squareIndex].contains(digit)) {
                    return false;
                }

                rows[row].add(digit);
                columns[col].add(digit);
                squares[squareIndex].add(digit);
            }
        }

        return true;
    }
}