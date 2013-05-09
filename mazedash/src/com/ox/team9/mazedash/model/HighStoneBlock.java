package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;

public class HighStoneBlock extends HighBlock {
	private Texture sprites;
	
	public HighStoneBlock(Texture sprites) {
		super(sprites);
		
		this.sprites = sprites;
	}
	
	@Override
	public int spriteColumn() {
		return 0;
	}

	@Override
	public int spriteRow() {
		return 15;
	}
	
	@Override
	public WorldElement cloneElement() {
		return new HighStoneBlock(sprites);
	}
}
