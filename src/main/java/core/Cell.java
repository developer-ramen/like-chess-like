package core;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cell {
	private final Vector location;
	private Piece piece;
	
	public Cell(Vector location) {
		this.location = location;
		this.piece = null;
	}
	
	public boolean isEmpty() {
		return piece == null;
	}
	
	public boolean isAttackableBy(Piece piece) {
		return isEmpty() || this.piece.isOpposedTo(piece);
	}
}
