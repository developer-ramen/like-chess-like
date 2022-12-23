package core;

import lombok.Data;

@Data
public class Board {
	private final int width, height;
	private final Cell[][] cells;
	
	public Board(final int width, final int height) {
		this.width = width;
		this.height = height;
		this.cells = new Cell[width][height];
	}
	
	public Board(final Cell[][] cells) {
		this.height = cells.length;
		this.width = cells[0].length;
		for (int i = 0; i < cells.length; i++) {
			Cell[] row = cells[i];
			if (row.length != width) {
				throw new IllegalArgumentException(
					"All rows must be the same length. "
						+ "Width length is " + width
						+ " but row " + i + " is " + row.length
				);
			}
		}
		this.cells = cells;
	}
}
