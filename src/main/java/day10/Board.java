package day10;

public class Board {
    public static void main(String[] args) {
        int[][] board= new int[][]{{1,-1,0},{-1,1,0},{0,0,1}};
        System.out.println(checkWon(board));
    }

    private static boolean checkWon(int[][] board){
        if (board[0][0] + board[1][1] + board[2][2] == 3)
            return true;
        if (board[0][2] + board[1][1] + board[2][0] == 3)
            return true;
        for (int i = 0; i < board.length; i++){
            if (board[i][0] + board[i][1] + board[i][2] == 3)
                return true;
            if (board[0][i] + board[1][i] + board[2][i] == 3)
                return true;
        }
        return false;
    }
}
