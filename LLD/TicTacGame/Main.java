package TicTacGame;
public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Player1", 'X');
        Player p2 = new Player("Player2", 'O');

        Game game = new Game(p1, p2);

        game.board.display();

        game.PlayeMove(0, 0);
        game.PlayeMove(1, 1);
        game.PlayeMove(0, 1);
        game.PlayeMove(2, 2);
        game.PlayeMove(0, 2);
    }
}