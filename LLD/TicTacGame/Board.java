package TicTacGame;

public class Board {
	
	
	char[][] board;
	
	
	public Board() {
		
		board=new char[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				board[i][j]='-';
			}
		}
	}
	
	
	public void display() {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*-----------------*");
		
	}
	
	boolean playMoves(int row, int col, char symbol) {
		
		if(board[row][col]=='-') {
			board[row][col]=symbol;
			return true;
		}
		return false;
	}
	
	
	
	

}
