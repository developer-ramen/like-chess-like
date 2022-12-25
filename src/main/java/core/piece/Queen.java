package core.piece;

import core.Board;
import core.Cell;
import core.Move;
import core.Piece;
import core.Point;
import core.constants.Color;
import core.constants.Name;
import core.constants.Value;

import java.util.List;

public class Queen extends Piece {
	public Queen(Color color, Point location, Board board) {
		super(Name.QUEEN, Value.QUEEN, color, location, board);
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
