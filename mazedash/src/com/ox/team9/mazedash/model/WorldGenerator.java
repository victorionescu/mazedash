package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;

public class WorldGenerator {

	private World world;
	
	private final Texture sprites;
	
	private final int rows, columns;
	
	public WorldGenerator(int rows, int columns, Texture sprites) {
		this.sprites = sprites;
		
		this.rows = rows;
		this.columns = columns;
	}
	
	public World getWorld(GameState gameState) {
		world = new World(rows, columns, sprites, gameState);
		
		
		// Create a "flat" world
		for (int row = 0; row < rows; row += 1)
			for (int column = 0; column < columns; column += 1) {
				world.addElement(row, column, new HighStoneBlock(sprites));
			}
		
		world.addElement(1, 0, new Tree(sprites));
		
		// Generate graph here.
		
		// Place key at (rows - 1, 0).
		world.addElement(rows - 1, 0, new Key(sprites));
		
		// Place gate at (0, columns - 1).
		world.addElement(0, columns - 1, new Gate(sprites));
		
		// Place player at (0, 0).
		world.setPlayer(0, 0);
		
		return world;
	}
	
}
