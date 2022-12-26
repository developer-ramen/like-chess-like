package core;

import lombok.ToString;

import java.util.List;

@ToString
public class Direction extends Vector {
	public Direction(int file, int rank) {
		super(file, rank);
	}
	
	public Direction(Vector vector) {
		super(vector.getFile(), vector.getRank());
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
