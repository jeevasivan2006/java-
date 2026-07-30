class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[row][j]=='.') continue;
                if(set.contains(board[row][j])) return false;
                set.add(board[row][j]);
            }
        }
         for(int col=0;col<9;col++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][col]=='.') continue;
                if(set.contains(board[j][col])) return false;
                set.add(board[j][col]);
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<>();
            for(int col=0;col<3;col++){
                for(int row=0;row<3;row++){
                    int k=(i/3)*3+row;
                    int j=(i%3)*3+col;
                    if(board[k][j]=='.') continue;
                    if(set.contains(board[k][j])) return false;
                    set.add(board[k][j]);
                }
            }
        }
        return true;
    }
}