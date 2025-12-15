/*
 Place n queens on a nxn chessboard
 */

import java.util.ArrayList;
import java.util.List;

public class P1 {
    //Using Backtracking {O(n!), O(n^2)}
    private static boolean isSafeQueen(int row, int col, String[][] board) 
    {
        //horizontal
        for(int j=0;j<board.length;j++)
        {
            if(board[row][j] == "Q")
            {
                return false;
            }
        }

        //vertical
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col] == "Q")
            {
                return false;
            }
        }

        //upper right
        for(int i=row, j=col; i>=0 && j<board.length; i--, j++)
        {
            if(board[i][j] == "Q")
            {
                return false;
            }
        }

        //upper left
        for(int i=row, j=col; i>=0 && j>=0; i--, j--)
        {
            if(board[i][j] == "Q")
            {
                return false;
            }
        }

        //lower right
        for(int i=row, j=col; i<board.length && j<board.length; i++, j++)
        {
            if(board[i][j] == "Q")
            {
                return false;
            }
        }

        //lower left
        for(int i=row, j=col; i<board.length && j>=0; i++, j--)
        {
            if(board[i][j] == "Q")
            {
                return false;
            }
        }

        return true;

    }

    private static void saveBoard(String[][] board, List<List<String>> allBoards) 
    {
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++)
        {
            String row = "";
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j] == "Q")
                {
                    row += "Q";
                }
                else{
                    row += "*";
                }
            }
            newBoard.add(row);
            
        }

        allBoards.add(newBoard);
    }

    private static void helper(String[][] board, List<List<String>> allBoards, int col) 
    {
        if(col == board.length)
        {
            saveBoard(board, allBoards);
            return;
        }

        for(int row=0;row<board.length;row++)
        {
            if(isSafeQueen(row, col, board))
            {
                board[row][col] = "Q";
                helper(board, allBoards, col+1);
                board[row][col] = "*";
            }
        }
    }

    public static List<List<String>> nQueens(int n)
    {
        List<List<String>> allBoards = new ArrayList<>();
        String[][] board = new String[n][n];

        helper(board, allBoards, 0);

        return allBoards;

    }

    public static void main(String[] args) {
        System.out.println(nQueens(4));
    }
}
