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

public class Knight extends Piece {
	public Knight(Color color, Point location) {
		super(Name.KNIGHT, Value.KNIGHT, color, location);
	}
	
	@Override
	public List<Cell> getAttackedCells(Board board) {
		return null;
	}
	
	@Override
	public List<Move> getPseudoLegalMoves(Board board) {
		return null;
	}
}
