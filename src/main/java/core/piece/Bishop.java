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

public class Bishop extends Piece {
	public Bishop(Color color, Vector location, Board board) {
		super(Name.BISHOP, Value.BISHOP, color, location, board);
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
