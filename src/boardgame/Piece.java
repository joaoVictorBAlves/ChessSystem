package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		// A PEÇA COMEÇA COM POSIÇÃO NULA
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
