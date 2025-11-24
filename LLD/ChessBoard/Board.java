package ChessBoard;


public class Board {

    private Box[][] boxes;
 
    private boolean whiteTurn = true;

    public Board() {
        this.initializeBoard();
    }

    private void initializeBoard() {
        boxes = new Box[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Box(i, j, null);
            }
        }
    }

    public Box getBox(int x, int y) {
        if (!isWithinBounds(x, y)) return null;
        return boxes[x][y];
    }

    public void placePiece(Pieces piece, int x, int y) {
        if (!isWithinBounds(x, y)) throw new IllegalArgumentException("Invalid position");
        boxes[x][y].setPieces(piece);
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        if (!isWithinBounds(startX, startY) || !isWithinBounds(endX, endY))
            return false;

        Box start = getBox(startX, startY);
        Box end = getBox(endX, endY);
        Pieces moving = start.getPieces();

        if (moving == null) return false; 

       
        if (moving.isWhite() != whiteTurn) {
            System.out.println("It's " + (whiteTurn ? "white" : "black") + "'s turn.");
            return false;
        }

     
        if (!moving.canMove(this, start, end)) {
            System.out.println("Invalid move according to piece rules.");
            return false;
        }

        end.setPieces(moving);
        start.removePiece();

      
        whiteTurn = !whiteTurn;
        return true;
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }

    public void setWhiteTurn(boolean whiteTurn) {
        this.whiteTurn = whiteTurn;
    }

    private boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public void printBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(boxes[i][j].toString() + " ");
            }
            System.out.println();
        }
        System.out.println("Turn: " + (whiteTurn ? "White" : "Black"));
    }
}
