package core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Name {
	PAWN('P', "♙♟"),
	KNIGHT('N', "♘♞"),
	BISHOP('B', "♗♝"),
	ROOK('R', "♖♜"),
	QUEEN('Q', "♕♛"),
	KING('K', "♔♚");
	
	private final char name;
	private final String symbols;
	
	public final char getName(Color color) {
		return color == Color.WHITE ? name : Character.toLowerCase(name);
	}
	
	public final char getSymbol(Color color) {
		return symbols.charAt(color.ordinal());
	}
}
