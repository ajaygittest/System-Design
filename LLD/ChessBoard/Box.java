package ChessBoard;

public class Box {

    private Pieces pieces;
    private int x;
    private int y;

    public Box(int x, int y, Pieces pieces) {
        this.x = x;
        this.y = y;
        this.pieces = pieces;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
        if (pieces != null) {
            pieces.setX(this.x);
            pieces.setY(this.y);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isEmpty() {
        return pieces == null;
    }

    public void removePiece() {
        this.pieces = null;
    }

    @Override
    public String toString() {
        if (pieces == null) return ".";
        String symbol = pieces.getName();
        return pieces.isWhite() ? symbol.toUpperCase() : symbol.toLowerCase();
    }
}
