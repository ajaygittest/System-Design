package ChessBoard;

public class King extends Pieces {

	public King(boolean white, int x, int y) {
		super(white, x, y, "K");
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {

		if (start == null || end == null)
			return false;
		Pieces targetPiece = end.getPieces();

		if (targetPiece != null && targetPiece.isWhite() == this.isWhite()) {
			return false;
		}

		int startX = start.getX();
		int startY = start.getY();
		int endX = end.getX();
		int endY = end.getY();

		int dx = Math.abs(startX - endX);
		int dy = Math.abs(startY - endY);

		if ((dx <= 1) && (dy <= 1) && !(dx == 0 && dy == 0)) {
			return true;
		}
		return false;
	}
}
