package core;

import core.constants.Color;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.Objects;

@Value
@NonFinal
public class Vector {
	int file, rank;
	
	public Vector(int file, int rank) {
		this.file = file;
		this.rank = rank;
	}
	
	public final Vector add(Vector other) {
		return new Vector(file + other.file, rank + other.rank);
	}
	
	public final Vector scale(int scalar) {
		return new Vector(file * scalar, rank * scalar);
	}
	
	public final Vector negate() {
		return new Vector(-file, -rank);
	}
	
	public final Vector color(Color color) {
		return color == Color.WHITE ? this : negate();
	}
	
	public final boolean existsInBoard(int width, int height) {
		return (file < 0 || rank < 0 || file >= width || rank >= height);
	}
	
	public final boolean existsInBoard(Board board) {
		return existsInBoard(board.getWidth(), board.getHeight());
	}
	
	public final void throwIfOutOfBounds(int width, int height) {
		if (existsInBoard(width, height)) {
			throw new IndexOutOfBoundsException(
				"Point is out of bounds: "
					+ "file: " + file + ", file bound:" + width
					+ ", rank: " + rank + ", rank bound" + height
			);
		}
	}
	
	public final void throwIfOutOfBounds(Board board) {
		throwIfOutOfBounds(board.getWidth(), board.getHeight());
	}
	
	@Override
	public final boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		var that = (Vector) obj;
		return this.file == that.file &&
			this.rank == that.rank;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(file, rank);
	}
	
	@Override
	public String toString() {
		return "Point[" +
			"file=" + file + ", " +
			"rank=" + rank + ']';
	}
}
