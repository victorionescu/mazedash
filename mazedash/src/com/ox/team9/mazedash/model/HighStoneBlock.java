package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class HighStoneBlock extends HighBlock {
	private final Sprite sprite;
	
	public HighStoneBlock(Texture sprites) {
		sprite = new Sprite(sprites, spriteRow() * 60, spriteColumn() * 104);
	}
	
	@Override
	public int spriteColumn() {
		return 1;
	}

	@Override
	public int spriteRow() {
		return 16;
	}
}
