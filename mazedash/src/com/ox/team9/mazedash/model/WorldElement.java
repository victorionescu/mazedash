package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class WorldElement {
	protected Sprite sprite;
	
	public WorldElement(Texture sprites) {
		sprite = new Sprite(sprites, spriteColumn() * 60, spriteRow() * 104, 60, 104);
	}
	
	public WorldElement(Texture sprites, int yOffset) {
		sprite = new Sprite(sprites, spriteColumn() * 60, spriteRow() * 104, 60, 104 - yOffset);
	}
	
	public abstract int spriteColumn();
	
	public abstract int spriteRow();
	
	public abstract void draw(int row, int column, int height, SpriteBatch spriteBatch);
}
