package core;

import core.constants.Color;
import core.constants.Name;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public abstract class Piece {
	private final Name name;
	private final Color color;
	
	private Point location;
	private int moveCount;
	
	public Piece(
		final Name name,
		final Color color,
		final Point location
	) {
		this(name, color, location, 0);
	}
	
	public abstract List<Cell> getAttackedCells(Board board);
	
	public abstract List<Move> getPseudoLegalMoves(Board board);
}
