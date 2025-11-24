package ChessBoard;


public abstract class Pieces {
    private boolean white;
    private int x;
    private int y;
    private String name;

    public Pieces(boolean white, int x, int y, String name) {
        this.white = white;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public boolean isWhite() {
        return white;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

  
    public abstract boolean canMove(Board board, Box start, Box end);
}
