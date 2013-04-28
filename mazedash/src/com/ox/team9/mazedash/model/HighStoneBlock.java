package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;

public class HighStoneBlock extends HighBlock {
	public HighStoneBlock(Texture sprites) {
		super(sprites);
	}
	
	@Override
	public int spriteColumn() {
		return 0;
	}

	@Override
	public int spriteRow() {
		return 15;
	}
}
