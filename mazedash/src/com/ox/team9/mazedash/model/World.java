package com.ox.team9.mazedash.model;

import com.ox.team9.mazedash.util.Array2D;

import java.util.LinkedList;

public class World {
	private final int rows, columns;
	private final Array2D<LinkedList<WorldElement>> environment;
	
	// Player position.
	private int playerRow, playerColumn;
	
	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		// Initialize 2D environment.
		environment = new Array2D<LinkedList<WorldElement>>(rows, columns);
		
		// Initialize the element stack for every cell.
		for (int row = 0; row < rows; row += 1)
			for (int column = 0; column < columns; column += 1)
				environment.putElement(new LinkedList<WorldElement>(), row, column);
	}
	
	
	// Stack element up at (row, column).
	public void addElement(int row, int column, WorldElement element) {
		environment.getElement(row, column).add(element);
	}
	
	
	// Set position of the player.
	public void setPlayer(int playerRow, int playerColumn) {
		this.playerRow = playerRow;
		this.playerColumn = playerColumn;
	}
	
	// Draw the world.
	public void draw() {
		System.out.println("Drawing the world!");
		
		
	}
}
