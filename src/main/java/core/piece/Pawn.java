package core.piece;

import core.Board;
import core.Cell;
import core.Direction;
import core.Move;
import core.Piece;
import core.Vector;
import core.constants.Color;
import core.constants.Name;
import core.constants.Value;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
	public Pawn(Color color, Vector location, Board board) {
		super(Name.PAWN, Value.PAWN, color, location, board);
	}
	
	@Override
	public List<Cell> getAttackedCells() {
		final List<Cell> cells = new ArrayList<>();
		
		final Vector
			leftDiagonal = Direction.NW.color(getColor()),
			rightDiagonal = Direction.NE.color(getColor());
		
		for (Vector diagonal : new Vector[] {leftDiagonal, rightDiagonal}) {
			if (!diagonal.existsInBoard(getBoard())) {
				continue;
			}
			final Cell attackedCell = getBoard().getCell(getLocation().add(diagonal));
			if (attackedCell.isAttackableBy(this)) {
				cells.add(attackedCell);
			}
		}
		
		return cells;
	}
	
	@Override
	public List<Move> getPseudoLegalMoves() {
		return null;
	}
}
