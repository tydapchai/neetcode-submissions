class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> squares = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            squares.put(i, new HashSet<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                char c = board[i][j];
                if(c == '.') {
                    continue;
                }
                if(!rows.get(i).add(board[i][j]) 
                || !cols.get(j).add(board[i][j])
                || !squares.get((i/3)*3 + (j/3)).add(board[i][j]))
                {
                    return false;
                }
            }
        }
        return true;
    }


}
