package ChessBoard;

public abstract class Pieces {
	
	private boolean killed=false;
	private boolean white=false;
	
	public Pieces(boolean white) {
		this.setWhite(white);
	}

	public boolean isKilled() {
		return killed;
	}

	public void setKilled(boolean killed) {
		this.killed = killed;
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}
	
	
	public abstract boolean canMove(Board board, Box start, Box end);

}
