package core;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

@Value
@EqualsAndHashCode(callSuper = true)
public class Direction extends Point {
	public Direction(int file, int rank) {
		super(file, rank);
	}
	
	public Direction(Point point) {
		super(point.getFile(), point.getRank());
	}
	
	public static final Direction
		NORTH = new Direction(-1, 0),
		SOUTH = new Direction(1, 0),
		WEST = new Direction(0, -1),
		EAST = new Direction(0, 1),
		NW = new Direction(NORTH.add(WEST)),
		NE = new Direction(NORTH.add(EAST)),
		SW = new Direction(SOUTH.add(WEST)),
		SE = new Direction(SOUTH.add(EAST));
	
	public static final List<Direction>
		CARDINALS = List.of(NORTH, SOUTH, WEST, EAST),
		DIAGONALS = List.of(NW, NE, SW, SE),
		ALL = List.of(NORTH, SOUTH, WEST, EAST, NW, NE, SW, SE);
}
