package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;

public abstract class Block extends WorldElement {
	public abstract int getHeight();
	
	protected Block(Texture sprites) {
		super(sprites);
	}
	
	@Override
	public void draw(int row, int column, int height) {
		sprite.setPosition(column * 60, row * 50);
	}
}
