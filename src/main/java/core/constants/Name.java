package core.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Name {
	PAWN("P", "♙♟"),
	KNIGHT("N", "♘♞"),
	BISHOP("B", "♗♝"),
	ROOK("R", "♖♜"),
	QUEEN("Q", "♕♛"),
	KING("K", "♔♚");
	
	private final String character, symbols;
	
	public final String getCharacter(Color color) {
		return color == Color.WHITE ? character : character.toLowerCase();
	}
	
	public final String getSymbol(Color color) {
		return color == Color.WHITE ? symbols.substring(0, 1) : symbols.substring(1);
	}
}
