package com.ox.team9.mazedash.util;

public class Array2D<T> {
	private final Object[][] array;
	private final int rows, columns;
	
	public Array2D(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		array = new Object[rows][columns];
	}
	
	public void putElement(T element, int row, int column) {
		array[row][column] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T getElement(int row, int column) {
		return (T)array[row][column];
	}
	
	int numberOfRows() {
		return rows;
	}
	
	int numberOfColumns() {
		return columns;
	}
}
