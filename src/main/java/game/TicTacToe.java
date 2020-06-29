package game;

public class TicTacToe {
    private char[][] board = new char[3][3];
    private char player = 'X';  //X or O
    private boolean isWinner = false;

    public TicTacToe() {
    }

    public void printBoard(){
        for (int i = 0 ; i < 3 ; i++){
            for ( int j = 0 ; j < 3 ; j++ ){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }


}


