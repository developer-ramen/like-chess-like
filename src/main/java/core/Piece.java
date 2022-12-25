package core;

import core.constants.Color;
import core.constants.Name;
import core.constants.Value;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public abstract class Piece {
	private final char name;
	private final int value;
	
	private final Color color;
	private Point location;
	private final Board board;
	
	private final ArrayList<Move> moves;
	private int moveCount;
	
	public Piece(
		final Name name,
		final Value value,
		final Color color,
		final Point location,
		final Board board
	) {
		this(
			name.getName(color),
			value.getValue(color),
			color,
			location,
			board,
			new ArrayList<>(), 0
		);
	}
	
	public boolean isAllyingTo(Piece other) {
		return color == other.color;
	}
	
	public boolean isOpposedTo(Piece other) {
		return !isAllyingTo(other);
	}
	
	public abstract List<Cell> getAttackedCells();
	
	public abstract List<Move> getPseudoLegalMoves();
}
