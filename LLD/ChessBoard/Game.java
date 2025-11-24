package ChessBoard;


public class Game {

    public static void main(String[] args) {
        Board board = new Board();

      
        King whiteKing = new King(true, 0, 4);
        King blackKing = new King(false, 7, 4);

        board.placePiece(whiteKing, 0, 4);
        board.placePiece(blackKing, 7, 4);

        board.printBoard();

      
        System.out.println("\nMove white king from (0,4) to (1,4):");
        boolean moved = board.movePiece(0, 4, 1, 4);
        System.out.println("Moved? " + moved);
        board.printBoard();

        System.out.println("\nTry illegal move (white tries again):");
        
        moved = board.movePiece(1, 4, 2, 4);
        System.out.println("Moved? " + moved);
        board.printBoard();

        System.out.println("\nBlack moves king from (7,4) to (6,4):");
        moved = board.movePiece(7, 4, 6, 4);
        System.out.println("Moved? " + moved);
        board.printBoard();

        System.out.println("\nWhite captures black? Move white (1,4) to (6,4) - invalid (too far):");
        moved = board.movePiece(1, 4, 6, 4);
        System.out.println("Moved? " + moved);
        board.printBoard();

        System.out.println("\nWhite moves (1,4) to (2,4):");
        moved = board.movePiece(1, 4, 2, 4);
        System.out.println("Moved? " + moved);
        board.printBoard();
    }
}
