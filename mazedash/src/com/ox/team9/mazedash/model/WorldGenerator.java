package com.ox.team9.mazedash.model;

public class WorldGenerator {

	private final World world;
	
	private final int rows, columns;
	
	public WorldGenerator(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		world = new World(rows, columns);
		
		
		// Create a "flat" world
		for (int row = 0; row < rows; row += 1)
			for (int column = 0; column < columns; column += 1) {
				world.addElement(row, column, new HighStoneBlock());
			}
		
		// Generate graph here.
		
		// Place key at (rows - 1, 0).
		world.addElement(rows - 1, 0, new Key());
		
		// Place gate at (0, columns - 1).
		world.addElement(0, columns - 1, new Gate());
		
		// Place player at (0, 0).
		world.setPlayer(0, 0);
	}
	
	public World getWorld() {
		return world;
	}
	
}
