package core.constants;

public enum Value {
	PAWN(1),
	KNIGHT(3),
	BISHOP(3),
	ROOK(5),
	QUEEN(9),
	KING(Integer.MAX_VALUE);
	
	private final int value;
	
	Value(int value) {
		this.value = value;
	}
	
	public int getValue(Color color) {
		return color == Color.WHITE ? value : -value;
	}
}
