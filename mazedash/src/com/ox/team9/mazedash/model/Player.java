package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends Character {
	
	public static final int SPEED_IN_PX_PER_SECOND = 150;
	
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
	public int getHeight() {
		return 0;
	}
	
}
