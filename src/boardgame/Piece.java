package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		// A PE�A COME�A COM POSI��O NULA
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
