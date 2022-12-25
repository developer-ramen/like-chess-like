package core;

import core.constants.Color;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.Objects;

@Value
@NonFinal
public class Point {
	int file, rank;
	
	public Point(int file, int rank) {
		this.file = file;
		this.rank = rank;
	}
	
	public final Point add(Point other) {
		return new Point(file + other.file, rank + other.rank);
	}
	
	public final Point scale(int scalar) {
		return new Point(file * scalar, rank * scalar);
	}
	
	public final Point negate() {
		return new Point(-file, -rank);
	}
	
	public final Point color(Color color) {
		return color == Color.WHITE ? this : negate();
	}
	
	public final void throwIfOutOfBounds(int fileBound, int rankBound) {
		if (file < 0 || rank < 0 || file >= fileBound || rank >= rankBound) {
			throw new IndexOutOfBoundsException(
				"Point is out of bounds: "
					+ "file: " + file + ", file bound:" + fileBound
					+ ", rank: " + rank + ", rank bound" + rankBound
			);
		}
	}
	
	@Override
	public final boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		var that = (Point) obj;
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
