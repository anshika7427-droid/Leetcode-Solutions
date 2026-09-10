class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row = 9
        // coloumns = 9

        // Validate Rows
        for(int row = 0 ; row < 9 ; row++){
            HashSet<Character> st = new HashSet<>();
            for(int col = 0 ; col < 9 ; col++){
                if(board[row][col] == '.') continue;
                if(st.contains(board[row][col])) return false;
                st.add(board[row][col]);
            }
        }

        // Validate Columns
        for(int col = 0 ; col < 9 ; col++){
            HashSet<Character> st = new HashSet<>();
            for(int row = 0 ; row < 9 ; row++){
                if(board[row][col] == '.') continue;
                if(st.contains(board[row][col])) return false;
                st.add(board[row][col]); 
            }
        }

        // Validate 3x3 Sub Boxes
        for(int sr = 0 ; sr < 9 ; sr += 3){
            int er = sr + 2;
            for(int sc = 0 ; sc < 9 ; sc += 3){
                int ec = sc + 2;

                HashSet<Character> st = new HashSet<>();

                for(int i = sr ; i <= er ; i++){
                    for(int j = sc ; j <= ec ; j++){
                        if(board[i][j] == '.') continue;
                        if(st.contains(board[i][j])) return false;
                        st.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}