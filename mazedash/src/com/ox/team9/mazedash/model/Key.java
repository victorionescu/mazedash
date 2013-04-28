package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Key extends WorldElement {

	public Key(Texture sprites) {
		super(sprites);
	}
	
	@Override
	public int spriteColumn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int spriteRow() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void draw(int row, int column, int height, SpriteBatch spriteBtach) {
		
	}

}
