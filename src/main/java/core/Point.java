package core;

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
