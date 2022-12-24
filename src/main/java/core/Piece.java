package core;

import core.constants.Color;
import core.constants.Name;
import core.constants.Value;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public abstract class Piece {
	private final char name;
	private final int value;
	
	private final Color color;
	private Point location;
	private int moveCount;
	
	public Piece(
		final Name name,
		final Value value,
		final Color color,
		final Point location
	) {
		this(name.getName(color), value.getValue(color), color, location, 0);
	}
	
	public abstract List<Cell> getAttackedCells(Board board);
	
	public abstract List<Move> getPseudoLegalMoves(Board board);
}
