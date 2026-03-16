package TicTacGame;

public class Game {

	Board board;

	Player player1;
	Player player2;
	Player currentPlayer;

	public Game(Player p1, Player p2) {
		this.board = new Board();
		this.player1 = p1;
		this.player2 = p2;
		this.currentPlayer = p1;
	}

	public void switchPlayer() {

		if (currentPlayer == player1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
	}

	public boolean checkWinner() {

		char[][] b = board.board;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (b[0][i] == b[i][1] && b[i][1] == b[i][2] && b[0][i] != '-') {
					return true;
				}
				if (b[i][0] == b[1][i] && b[1][i] == b[2][i] && b[i][0] != '-') {
					return true;
				}

				if (b[0][0] == b[1][1] && b[1][1] == b[2][2] && b[0][0] != '-') {
					return true;
				}
				if (b[2][0] == b[1][1] && b[1][1] == b[0][2] && b[2][0] != '-') {
					return true;
				}

			}

		}
		return false;

	}

	public void PlayeMove(int row, int col) {
		boolean success = board.playMoves(row, col, currentPlayer.symbol);

		if (!success) {
			System.out.println("Invalid Move");
			return;
		}

		board.display();
		

		if (checkWinner()) {
			System.out.println(currentPlayer.name + " wins!");
			return;
		}

		switchPlayer();

	}

}
