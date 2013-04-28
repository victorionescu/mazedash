package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends Character {
	public Player(Texture sprites) {
		super(sprites);
	}
	
	@Override
	public int spriteColumn() {
		return 1;
	}
	
	@Override
	public int spriteRow() {
		return 0;
	}
	
	@Override
	public void draw(int row, int column, int height, SpriteBatch spriteBatch) {
		sprite.setPosition(column * 60, row * 50 + height * 24);
		sprite.draw(spriteBatch);
	}
}
