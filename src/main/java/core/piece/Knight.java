package core.piece;

import core.Board;
import core.Cell;
import core.Move;
import core.Piece;
import core.Vector;
import core.constants.Color;
import core.constants.Name;
import core.constants.Value;

import java.util.List;

public class Knight extends Piece {
	public Knight(Color color, Vector location, Board board) {
		super(Name.KNIGHT, Value.KNIGHT, color, location, board);
	}
	
	@Override
	public List<Cell> getAttackedCells() {
		return null;
	}
	
	@Override
	public List<Move> getPseudoLegalMoves() {
		return null;
	}
}
